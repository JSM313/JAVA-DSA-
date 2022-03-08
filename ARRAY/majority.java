
// NAIVE APPROACH
import java.io.*;
import java.util.*;

class majority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++)
            a[i] = sc.nextInt();

        // int maxCount = 0, index = -1;

        // for (int i = 0; i < a.length; i++) {
        // int count = 0;
        // for (int j = i; j < a.length; j++) {
        // if (a[i] == a[j])
        // count++;
        // }

        // if (count > maxCount) {
        // maxCount = count;
        // index = i;
        // }
        // }
        // if (maxCount > n / 2) {
        // System.out.println(a[index]);
        // } else {
        // System.out.println(-1);
        // }
        // }

        // ! USING MOORE's voting algorithm

        int ansIndex = 0, count = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[ansIndex]) {
                count++;
            }

            else {
                count--;
            }

            if (count == 0) {
                ansIndex = i;
                count = 1;
            }
        }
        // * TO CHECK THE SURETY THAT THE ANSWER THAT IS FOUND ABOVE IS REALLY THE
        // MAJORITY ELEMENT OR NOT?
        int suspectedAnswer = a[ansIndex];

        int maxCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == suspectedAnswer) {
                maxCount++;
            }
        }
        if (maxCount > n / 2) {
            System.out.println("Majority Element: " + " " + suspectedAnswer);
        } else {
            System.out.println(false);
        }
    }
}