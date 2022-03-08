import java.io.*;
import java.util.Scanner;

class binarysearch {

    public static int bSearch(int[] a, int data) {
        int start = 0;
        int end = a.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (data == a[mid]) {
                return mid;
            }

            else if (data > a[mid]) {
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int data = sc.nextInt();
        int answer = bSearch(a, data);
        System.out.println(answer);
    }
}