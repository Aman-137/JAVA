import java.util.Scanner;

//import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class PosOrNeg {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        sc.close();

        if (n > 0) {
            System.out.println(n + " is Positive");
        } else {
            System.out.println(n + " is Negative");
        }
    }
}