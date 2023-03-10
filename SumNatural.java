import java.util.Scanner;

public class SumNatural {

    static int sumOfNaturalNO(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number : ");
        n = sc.nextInt();

        sc.close();

        System.out.print("The sum till " + n + " is = " + sumOfNaturalNO(n));
    }
}
