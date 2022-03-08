import java.util.Scanner;

class sumof2arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = sc.nextInt();
        }

        int[] sum = new int[n1 > n2 ? n1 : n2];

        int carry = 0;
        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = sum.length - 1;

        while (k >= 0) {
            int digit = carry;

            if (i >= 0) {
                digit += a1[i];
            }

            if (j >= 0) {
                digit += a2[j];
            }

            carry = digit / 10;
            digit = digit % 10;

            sum[k] = digit;
            i--;
            j--;
            k--;
        }

        if (carry != 0) {
            System.out.print(carry);
        }

        for (int val : sum)
            System.out.print(val);
    }
}