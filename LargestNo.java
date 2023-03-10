import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args) {
        int a, b, c, temp, largest;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = sc.nextInt();
        System.out.print("Enter the second number: ");
        b = sc.nextInt();
        System.out.print("Enter the third number: ");
        c = sc.nextInt();

        sc.close();

        temp = (a > b) ? a : b;
        largest = c > temp ? c : temp;

        System.out.println("The Largest no. is = " + largest);
    }
}
