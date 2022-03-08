import java.io.*;
import java.util.Scanner;

class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int d = sc.nextInt();
        int index = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == d) {
                index = i;
            }
        }
        System.out.println(index);
    }
}