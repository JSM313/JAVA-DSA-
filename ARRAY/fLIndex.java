import java.io.*;
import java.util.Scanner;

class fLIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int data = sc.nextInt();

        int low = 0, high = a.length - 1;
        int firstIndex = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (data > a[mid])
                low = mid + 1;

            else if (data < a[mid])
                high = mid - 1;

            else {
                firstIndex = mid;
                low = mid + 1;
            }
        }
        System.out.println("FIRST INDEX " + " " + firstIndex);

        high = a.length - 1;
        low = 0;
        int lastIndex = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (data > a[mid])
                low = mid + 1;

            else if (data < a[mid])
                high = mid - 1;

            else {
                lastIndex = mid;
                high = mid - 1;
            }
        }
        System.out.println("LAST INDEX" + " " + lastIndex);

    }
}