import java.io.*;
import java.util.*;

class secLar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++)
            a[i] = sc.nextInt();

        int lar = a[0];
        int secLar = -1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > lar) {
                secLar = lar;
                lar = a[i];
            }
        }
        System.out.println(secLar);
    }
}