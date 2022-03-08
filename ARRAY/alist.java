import java.io.*;
import java.util.*;

class alist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Arraylist<Integer> list = new Arraylist<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list + "\t" + list.size());

        // To add an item at a paticular index
        list.add(1, 1000);
        // This adds 1000 at index 1 in place of 20
        System.out.println(list + "\t" + list.size());

        int val = list.get(1);
        // Fetches item at index 1
        System.out.println(val);

        list.remove(1);
        System.out.println(list + "\t" + list.size());

        list.set(0, 57);
        System.out.println(list + "\t" + list.size());

        ArrayList<String> l2 = new ArrayList<>();
        l2.add("Ichigo Kurosaki");
        l2.add("Zaraki Kenpachi");
        l2.add("Aizen Sosuke");
        l2.add("Byakuya Kuchiki");

        System.out.println(l2);

    }
}
