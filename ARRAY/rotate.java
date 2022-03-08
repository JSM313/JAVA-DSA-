import java.util.Scanner;

class rotate {
    public static void display(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void reverse(int[] a, int i, int j) {
        int li = i, ri = j;
        while (li < ri) {
            int temp = a[li];
            a[li] = a[ri];
            a[ri] = temp;
            li++;
            ri--;
        }
    }

    public static void rotateArray(int[] a, int k) {
        k = k % a.length;
        if (k < 0) {
            k = k + a.length;
        }

        // reversing part 1
        reverse(a, 0, a.length - k - 1);

        // reversing part 2
        reverse(a, a.length - k, a.length - 1);

        // revesrsing the whole array again
        reverse(a, 0, a.length - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        rotateArray(a, k);
        display(a, n);
    }
}