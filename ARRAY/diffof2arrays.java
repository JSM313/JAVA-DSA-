import java.io.*;
import java.util.Scanner;

class diffof2arrays {
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

        // As we are assuming that n2 > n1
        int[] diff = new int[n2];
        int carry = 0;

        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = diff.length - 1;

        while (k >= 0) {
            int digit = 0;
            int a1value = i >= 0 ? a1[i] : 0;
            if (a2[j] + carry >= a1value) {
                digit = a2[j] + carry - a1value;
                carry = 0;
            } else {
                digit = a2[j] + carry + 10 - a1value;
                carry = -1;
            }

            diff[k] = digit;
            i--;
            j--;
            k--;

        }
        // To remove post occuring zeroes in the answer such as 1000-999 = 0001 to remove extra zeroes in the answer
        int index = 0;
        while (index < diff.length) {
            if (diff[index] == 0) {
                index++;
            } else {
                break;
            }
        }

        while (index < diff.length) {
            System.out.print(diff[index]);
            index++;
        }

    }
}