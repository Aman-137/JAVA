package String;

import java.util.Scanner;

public class CountPunctuation {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence : ");
        str = sc.nextLine();
        sc.close();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == ':'
                    || str.charAt(i) == '/' || str.charAt(i) == '?' || str.charAt(i) == '.') {
                count++;
            }

        }

        System.out.print("The total number of punctuation in sentence is = " + count);

    }
}
