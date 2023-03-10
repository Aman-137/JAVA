import java.util.Scanner;

public class Automorphic {

    static boolean isAutomorphicNo(int n) {
        int square = n * n;

        while (n > 0) {
            if (n % 10 != square % 10)
                return false;
            n = n / 10;
            square = square / 10;

        }
        return true;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        sc.close();

        // if (isAutomorphicNo(n))
        // System.out.print("This is an Automorphic Number.");
        // else {
        // System.out.print("This is Not a Automorphic Number.");
        // }

        for (int i = 1; i <= n; i++) {
            if (isAutomorphicNo(i)) {
                System.out.print(i + " ");
            }
        }
    }
}