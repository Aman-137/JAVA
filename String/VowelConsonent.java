package String;

import java.util.Scanner;

public class VowelConsonent {

    public static void main(String[] args) {
        String str;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence : ");
        str = sc.nextLine();
        sc.close();

        str.toLowerCase();

        int vCount = 0;
        int cCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                vCount++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                cCount++;
            }
        }

        System.out.print("The number of vowel = " + vCount);
        System.out.println();
        System.out.println("The number of consonent = " + cCount);

    }
}
