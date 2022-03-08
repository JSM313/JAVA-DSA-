import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack<String> prefix = new Stack<>();
        Stack<String> postfix = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(') {
                op.push(ch);
            }
            else if ((ch <= '0' && ch <= '9') || (ch == 'a' && ch <= 'z') || (ch == 'A' && ch <= 'Z')) {
                postfix.push(ch + "");
                prefix.push(ch + "");
            }
            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/')
            {
                while(op.size() > 0 && op.peek() != '(' && precedence(ch) <= precedence(op.peek())
                {
                    char operator = op.peek();
                    String post2 = postfix.pop();
                    String post1 = postfix.pop();
                    String postV = post1 + post2 + operator;
                    postfix.push(postV);

                    String pre2 = prefix.pop();
                    String pre1 = prefix.pop();
                    String preV = operator + pre1 + pre2;
                    prefix.push(preV);
                }
                op.push(ch);
            }
            else if(ch == ')')
            {
                while(op.peek() != '(' && op.size() > 0)
                {
                    char operator = op.peek();

                    String post2 = postfix.pop();
                    String post1 = postfix.pop();
                    String postV = post1 + post2 + operator;
                    postfix.push(postV);

                    String pre2 = prefix.pop();
                    String pre1 = prefix.pop();
                    String preV = operator + pre1 + pre2;
                    prefix.push(preV);

                }
                if(op.size() > 0)
                {
                    op.pop();
                }
            }

        }
        while(op.size() > 0)
        {
                    char operator = op.peek();

                    String post2 = postfix.pop();
                    String post1 = postfix.pop();
                    String postV = post1 + post2 + operator;
                    postfix.push(postV);

                    String pre2 = prefix.pop();
                    String pre1 = prefix.pop();
                    String preV = operator + pre1 + pre2;
                    prefix.push(preV);

        }
        System.out.println(postfix.peek());
        System.out.println(prefix.peek());
    }

    public static int precedence(char ch) {
        if (ch == '+' || ch == '-') {
            return 1;
        } else if (ch == '*' || ch == '/') {
            return 2;
        } else {
            return 0;
        }
    }

}