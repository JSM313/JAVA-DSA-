import java.util.*;

public class firstIndex {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int x = sc.nextInt();
    System.out.println(fIndex(a, 0, x));
  }

  public static int fIndex(int[] a, int idx, int x) {
    if (idx == a.length) {
      System.out.println("not found ");
      return -1;
    }

    if (a[idx] == x) {
      return idx;
    }

    int ans = fIndex(a, idx + 1, x);
    return ans;
  }

}
