import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }

    int n = sc.nextInt();
    int [] a = new int[n];for(
    int i = 0;i<a.length;i++)a[i]=sc.nextInt();

    int currSum = 0, maxSum = Integer.MAX_VALUE;for(
    int i = 0;i<a.length;i++)
    {
        currSum += a[i];

        if (currSum > maxSum)
            maxSum = currSum;

        if (currSum < 0)
            currSum = 0;
    }
}