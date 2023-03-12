package String;

import java.util.Arrays;

public class CheckAnagram {

    static void isAnagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Unequal length - not Anagram.");
        } else {
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            if (Arrays.equals(ch1, ch2) == true) {
                System.out.println("Both the strings are Anagram.");
            } else {
                System.out.println("Both the strings are not Anagram.");
            }
        }

    }

    public static void main(String[] args) {
        String str1 = "Brag";
        String str2 = "Grab";

        isAnagram(str1, str2);
    }
}
