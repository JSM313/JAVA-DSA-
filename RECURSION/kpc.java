import java.io.*;
import java.util.*;

public class kpc {

    static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> result = getKPC(str);
        System.out.println(result);
    }

    public static ArrayList<String> getKPC(String str) {

        if (str.length() == 0) {
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }

        char ch = str.charAt(0);
        String remainingString = str.substring(1);

        ArrayList<String> recursiveResult = getKPC(remainingString);
        ArrayList<String> mres = new ArrayList<>();

        String codesforch = codes[ch - '0'];
        for (int i = 0; i < codesforch.length(); i++) {
            char chcode = codesforch.charAt(i);
            for (String rstr : recursiveResult)
                mres.add(chcode + rstr);
        }
        return mres;
    }

}
