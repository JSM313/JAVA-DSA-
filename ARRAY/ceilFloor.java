import java.io.*;
import java.util.Scanner;

class ceilFloor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int data = sc.nextInt();

        int start = 0;
        int end = a.length - 1;
        int ceil = 0, floor = 0;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (data > a[mid]) {
                start = mid + 1;
                floor = a[mid];
            }

            else if (data < a[mid]) {
                end = mid - 1;
                ceil = a[mid];
            }

            else {
                ceil = a[mid];
                floor = a[mid];
            }
        }
        System.out.println(ceil);
        System.out.println(floor);
    }
}