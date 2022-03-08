
import java.util.*;

public class implementation {
  public static void main(String[] args) {
    // * Used in storing table of information
    // * When a key is given and a value is stored in that key

    HashMap<String, Integer> hm = new HashMap<>();
    // * Put is used for insertion and updation
    hm.put("India", 200);
    hm.put("NewZealand", 320);
    hm.put("Antigua", 40);
    hm.put("Scotland", 50);

    System.out.println(hm.get("India"));// * If the paticular key is present then this method will return the value
                                        // *present in that key

    System.out.println(hm.get("Nigeria"));// * As Nigeria is not present in the table it will return null

    /**
     * ! Note:- In Hashmap we can't control at which postition the put command will
     * insert the value, it is in random order
     */

    hm.containsKey("India");// returns a boolean value whether the key is present in the Hashmap or not.

    Set<String> keys = hm.keySet();
    System.out.println(keys);

    for (String key : hm.keySet()) {
      Integer value = hm.get(key);
      System.out.println(key + "-->" + value);
    }

  }
}
