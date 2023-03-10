import java.util.Scanner;

class Armstrong {

    static boolean isarmstrong(int n) {
        int temp, digits = 0, last = 0, sum = 0;

        temp = n;
        while (temp > 0) {
            temp = temp / 10;
            digits++; // no. of digit is stored here

        }

        temp = n;
        while (temp > 0) {
            last = temp % 10;
            sum += Math.pow(last, digits);
            temp = temp / 10;
        }

        if (n == sum) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        num = sc.nextInt();
        System.out.println("Armstrong number upto " + num + " is:");
        sc.close();

        /*
         * if (isarmstrong(num)) {
         * System.out.println(num + " is Armstrong No.");
         * } else {
         * System.out.println(num + " is Not a Armstrong No.");
         * }
         */

        for (int i = 0; i <= num; i++) {
            if (isarmstrong(i)) {
                System.out.print(i + " ");
            }
        }

    }
}