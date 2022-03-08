import java.util.*;

public class palindrome {
    public static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            int dig = n % 10;
            rev = rev * 10 + dig;
            n = n / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int reversedAns = reverse(n);
        if (n == reversedAns) {
            System.out.println("Palindrome ");
        } else {
            System.out.println("NOT a Palindrome ");
        }
    }
}
