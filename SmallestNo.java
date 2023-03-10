import java.util.Scanner;

public class SmallestNo {
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

        temp = (a > b) ? b : a;
        largest = c > temp ? temp : c;

        System.out.println("The Smallest no. is = " + largest);
    }
}
