import java.io.*;
import java.util.*;

public class infixEvaluation {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(') {
                operators.push(ch);
            } else if (Character.isDigit(ch)) {
                operands.push(ch - '0');
            } else if (ch == ')') {
                while (operators.peek() != '(') {
                    char operator = operators.pop();
                    int value2 = operands.pop();
                    int value1 = operands.pop();
                    int valueFromOp = operation(value1, value2, operator);
                    operands.push(valueFromOp);
                }
                operators.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (operators.size() > 0 && operators.peek() != '('
                        && precedence(ch) <= precedence(operators.peek())) {
                    char operator = operators.pop();
                    int value2 = operands.pop();
                    int value1 = operands.pop();
                    int valueFromOp = operation(value1, value2, operator);
                    operands.push(valueFromOp);
                }
                operators.push(ch);
            }
        }
        while (operators.size() != 0) {
            char operator = operators.pop();
            int value2 = operands.pop();
            int value1 = operands.pop();
            int valueFromOp = operation(value1, value2, operator);
            operands.push(valueFromOp);
        }
        System.out.println(operands.peek());
        // code
    }

    public static int precedence(char optor) {
        if (optor == '+')
            return 1;

        else if (optor == '-')
            return 1;

        else if (optor == '*')
            return 2;

        else
            return 2;
    }

    public static int operation(int v1, int v2, char optor) {
        if (optor == '+')
            return v1 + v2;

        else if (optor == '-')
            return v1 - v2;

        else if (optor == '*')
            return v1 * v2;

        else
            return v1 / v2;
    }
}