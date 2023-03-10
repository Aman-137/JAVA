import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
        int x;
        int y;
        int gcd = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x = ");
        x = sc.nextInt();
        System.out.print("Enter the value of y = ");
        y = sc.nextInt();

        sc.close();

        for (int i = 1; i <= x && i <= y; i++) {

            if (x % i == 0 && y % i == 0) {
                gcd = i;
            }

        }
        System.out.printf("GCD of " + x + " and " + y + " is = " + gcd);

    }
}
