import java.util.Scanner;

class Factorial {
    static int fact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static void main(String[] args) {
        // int n;
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = n.nextInt();
        n.close();

        System.out.println(fact(num));
    }
}