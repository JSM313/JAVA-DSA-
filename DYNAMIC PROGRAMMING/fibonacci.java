import java.io.*;
import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Fib(n, new int[n + 1]));
    }

    public static int Fib(int n, int[] qb) {
        if (n == 0 || n == 1)
            return n;

        if (qb[n] != 0)
            return qb[n];
        qb[n] = Fib(n - 1, qb) + Fib(n - 2, qb);

        return Fib(n - 1, qb) + Fib(n - 2, qb);
    }

}
