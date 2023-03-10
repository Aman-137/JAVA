import java.util.Scanner;

// //import javax.swing.text.ChangedCharSetException;

// public class PerfectSquare {

//     static boolean checkPerfectSquare(int n) {

//         for (int i = 1; i * i <= n; i++) {
//             if (n % i == 0 && n / i == i) {
//                 return true;
//             }

//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         int n;

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         n = sc.nextInt();
//         sc.close();

//         if (checkPerfectSquare(n)) {
//             System.out.print(n + " is a perfect Square");
//         } else {
//             System.out.print(n + " is not a perfect Square");
//         }
//     }
// }

public class PerfectSquare {

    static boolean checkPerfectSquare(double n) {
        double sqrt = Math.sqrt(n);

        double floor = Math.floor(sqrt);

        if (sqrt - floor == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        double n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        sc.close();

        if (checkPerfectSquare(n)) {
            System.out.print(n + " is a perfect Square");
        } else {
            System.out.print(n + " is not a perfect Square");
        }

    }
}