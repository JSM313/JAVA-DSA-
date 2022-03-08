import java.io.*;
import java.util.*;

class maxSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++)
            a[i] = sc.nextInt();

        // Brute force Approach
        // int maxSum = 0;
        // for (int i = 0; i < a.length; i++) {
        // int sum = 0;
        // for (int j = i; j < a.length; j++) {
        // sum += a[j];
        // if (sum > maxSum)
        // maxSum = sum;
        // }

        // }
        // System.out.println("Maximum subarray Sum is" + " " + maxSum);

        // * KADANE's algorithm Efficient Approach
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            currSum += a[i];
            if (currSum > maxSum)
                maxSum = currSum;

            if (currSum < 0)
                currSum = 0;

        }
        System.out.println("Maximium subarray Sum is " + " " + maxSum);

    }
}