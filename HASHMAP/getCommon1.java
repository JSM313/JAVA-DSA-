import java.util.*;

public class getCommon1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int[] a = new int[n1];
    for (int i = 0; i < a.length; i++) {
      a[i] = sc.nextInt();
    }

    int n2 = sc.nextInt();
    int[] a2 = new int[n2];
    for (int i = 0; i < a2.length; i++) {
      a2[i] = sc.nextInt();
    }

    HashMap<Integer, Integer> hmap = new HashMap<>();
    for (int val : a) {
      if (hmap.containsKey(val)) {
        int orig = hmap.get(val);
        int newf = orig + 1;
        hmap.put(val, newf);
      } else {
        hmap.put(val, 1);
      }
    }
    for (int val : a2) {
      if (hmap.containsKey(val)) {
        System.out.println(val);
        hmap.remove(val);
      }
    }

  }
}