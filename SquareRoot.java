import java.util.Scanner;
import java.lang.Math;

public class SquareRoot {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        sc.close();

        System.out.println("The square root of " + n + " is: " + Math.sqrt(n));

        System.out.println("The formula result is : " + squareroot(n));
    }

    public static double squareroot(int n) {

        double temp;
        double sqrt = n / 2;

        do {
            temp = sqrt;
            sqrt = (temp + (n / temp)) / 2;
        } while ((temp - sqrt) != 0);
        return sqrt;
    }
}
