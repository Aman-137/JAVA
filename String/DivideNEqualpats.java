package String;

public class DivideNEqualpats {

    public static void main(String[] args) {
        String str = "aaaabbbbcccc";

        int len = str.length();

        int n = 3;
        int temp = 0;
        int chars = len / n;

        String[] euqalStr = new String[n];

        if (len % n != 0) {
            System.out.println("Sorry this string cannot be divided in euqal parts");
        } else {
            for (int i = 0; i < len; i = i + chars) {
                String part = str.substring(i, i + chars);
                euqalStr[temp] = part;
                temp++;
            }

            System.out.println(n + " equal parts of given string are: ");
            for (int i = 0; i < euqalStr.length; i++) {
                System.out.println(euqalStr[i]);
            }
        }

    }
}
