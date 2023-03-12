package String;

//import java.io.StreamCorruptedException;
import java.util.Scanner;

public class SubsetOfString {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        str = sc.nextLine();
        sc.close();

        int len = str.length();
        // int temp = 0;

        // String[] arr = new String[len * (len + 1) / 2];

        System.out.println("All subsets of String = ");

        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {

                System.out.println(str.substring(i, j + 1));
                // arr[temp] = str.substring(i, j + 1);
                // temp++;
            }
        }

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
    }
}
