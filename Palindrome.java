import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int rem, sum = 0, temp;

        System.out.println("Enter a number: ");
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        n.close();

        temp = num;

        while (num > 0) {
            rem = num % 10;
            sum = (sum * 10) + rem;
            num = num / 10;
        }
        if (temp == sum) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a Palindrome number");
        }
    }
}
