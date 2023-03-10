import java.util.Scanner;

public class ASCIIPrint {

    public static void main(String[] args) {
        char ch1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any character : ");
        ch1 = sc.next().charAt(0);
        sc.close();

        int ascii1 = (int) ch1;

        System.out.println("The ASCII value of " + ch1 + " is : " + ascii1);
    }
}
