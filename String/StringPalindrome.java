package String;

import java.util.Scanner;

public class StringPalindrome {

    public static boolean checkPalindrome(String str) {
        boolean flag = true;

        str = str.toLowerCase();

        for (int i = 0; i < str.length() / 2; i++) {

            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                flag = false;
                break;
            }
        }
        if (flag)
            return true;

        else
            return false;
    }

    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word - ");
        str = sc.nextLine();
        sc.close();

        if (checkPalindrome(str))
            System.out.println("String is Palindrome");
        else
            System.out.println("String is Not Palindrome");
    }
}
