import java.util.Scanner;

public class SwapingBitwise {
    public static void main(String[] args) {
        int a, b;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = sc.nextInt();
        System.out.print("Enter the second number: ");
        b = sc.nextInt();
        sc.close();

        System.out.println("Befor swapping - ");
        System.out.println("a = " + a + ", " + "b = " + b);

        System.out.println("After Swapping");

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a = " + a + ", " + "b = " + b);

    }
}
