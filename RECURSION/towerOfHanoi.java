
import java.util.*;

class towerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tower1 = sc.nextInt();
        int tower2 = sc.nextInt();
        int tower3 = sc.nextInt();
        toh(n, tower1, tower2, tower3);
    }

    public static void toh(int n, int tower1, int tower2, int tower3) {
        if (n == 0)
            return;
        toh(n - 1, tower1, tower3, tower2);
        System.out.println(n + "[" + tower1 + "->" + tower2 + "]");
        toh(n - 1, tower3, tower2, tower1);

    }
}