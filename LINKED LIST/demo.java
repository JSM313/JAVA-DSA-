import java.util.*;

public class demo {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        System.out.println(list);
        list.addFirst(100);
        System.out.println(list);
        System.out.println(list.size());
    }

}
