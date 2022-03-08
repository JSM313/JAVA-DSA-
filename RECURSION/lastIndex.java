import java.util.*;

public class lastIndex {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < a.length; i++) {
      a[i] = sc.nextInt();
    }
    int x = sc.nextInt();
    System.out.println(lIndex(a, n, x));
  }

  public static int lIndex(int[] a, int n, int x) {
    if (n < 0) {
      System.out.println("Not found");
      return -1;
    }

    if (x == a[n - 1]) {
      return n - 1;
    }

    int ans = lIndex(a, n - 1, x);
    return ans;
  }
}
