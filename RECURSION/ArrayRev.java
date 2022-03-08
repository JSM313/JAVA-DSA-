import java.util.*;

public class ArrayRev {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < a.length; i++) {
      a[i] = sc.nextInt();
    }

    reverse(a, n);
  }

  public static void reverse(int[] a, int n) {
    if (n == 0) {
      return;
    }

    System.out.println(a[n - 1]);
    reverse(a, n - 1);

  }
}