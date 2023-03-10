import java.util.Scanner;

public class EvenNo {

    static boolean checkEven(int n) {

        for (int i = 0; i <= n; i++) {
            if (n % 2 == 0)
                return true;
        }
        return false;
    }

    static boolean checkOdd(int n) {

        for (int i = 0; i <= n; i++) {
            if (n % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n;
        int start;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number : ");
        start = sc.nextInt();
        System.out.print("Enter the last number : ");
        n = sc.nextInt();
        sc.close();

        for (int i = start; i <= n; i++) {
            // if (checkEven(i)) {
            // System.out.print(i + " ");
            // }
            if (checkOdd(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
