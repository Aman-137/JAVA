import java.util.Scanner;

public class ReverseNumber {

    static int revNum(int n) {
        int reverse = 0;
        int rem;

        while (n != 0) {
            rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n / 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        sc.close();

        System.out.print("The reverse of number is : " + revNum(n));
    }
}
