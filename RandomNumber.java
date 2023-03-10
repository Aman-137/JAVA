import java.util.Scanner;

public class RandomNumber {

    static int randNo(int min, int max) {

        int b = (int) Math.random() * (max - min + 1) + min;

        return b;

    }

    public static void main(String[] args) {
        int min, max;

        Scanner mn = new Scanner(System.in);
        System.out.println("Enter the min No.- ");
        min = mn.nextInt();
        Scanner mx = new Scanner(System.in);
        System.out.println("Enter the max No.- ");
        max = mx.nextInt();
        mn.close();
        mx.close();

        System.out.println("The random no. is = " + randNo(min, max));
    }
}
