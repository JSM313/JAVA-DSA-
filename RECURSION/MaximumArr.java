public class MaximumArr {
  public static void main(String[] args) {
    int[] a = { 12, 143, 1, 7, 91 };
    System.out.println(max(a, 5));
  }

  public static int max(int[] a, int n) {
    if (n == 0) {
      return Integer.MIN_VALUE;
    }

    int ans = max(a, n - 1);
    int finalAns = Math.max(ans, a[n - 1]);
    return finalAns;
  }
}
