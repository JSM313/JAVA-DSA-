import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (hm.containsKey(ch)) {
                int origFreq = hm.get(ch);
                int newFreq = origFreq + 1;h
                hm.put(ch, newFreq);
            } else {
                hm.put(ch, 1);
            }
        }

        char ch = str.charAt(0);
        for (Character key : hm.keySet()) {
            if (hm.get(key) > hm.get(ch)) {
                ch = key;
            }
        }
        System.out.println(ch);

    }
}