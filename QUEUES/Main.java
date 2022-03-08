import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
  public static void main(String[] args) {
    PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
    int[] marks = { 23, 12, 31, 41, 14, 93, 63 };
    // Automatically sorts which is called as Heap Sort
    for (int val : marks) {
      pq.add(val);
    }

    while (pq.size() > 0) {
      System.out.println(pq.peek());
      pq.remove();
    }

  }

}
