package String;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateChar {

    public static void countDuplicate(String str) {

        HashMap<Character, Integer> mp = new HashMap<Character, Integer>();

        char[] string = str.toCharArray();

        for (char c : string) {
            if (mp.containsKey(c)) {
                mp.put(c, mp.get(c) + 1);
            } else {
                mp.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }

    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";

        countDuplicate(str);

    }
}
