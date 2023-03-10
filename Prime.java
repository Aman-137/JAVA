//import java.util.Scanner;

/*
 * public class Prime {
 * 
 * static void prime(int n) {
 * int m = 0, flag = 0;
 * 
 * m = n / 2;
 * 
 * if (n == 0 || n == 1) {
 * System.out.println(n + " is not a prime number");
 * 
 * } else {
 * for (int i = 2; i <= m; i++) {
 * if (n % i == 0) {
 * System.out.println(n + " is not a prime number");
 * flag = 1;
 * break;
 * }
 * }
 * 
 * if (flag == 0) {
 * System.out.println(n + " is prime number");
 * }
 * }
 * 
 * }
 * 
 * public static void main(String[] args) {
 * int n = 25;
 * prime(n);
 * }
 * }
 */

public class Prime {

    static boolean isPrime(int n) {

        if (n == 0 || n == 1) {
            return false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;

        }
    }

    public static void main(String[] args) {
        int n = 89;

        if (isPrime(n)) {
            System.out.println(n + " is prime");
        } else {
            System.out.print(n + " is not prime");
        }
    }
}
/*
 * public class Prime {
 * 
 * static boolean isPrime(int n) {
 * // int flag = 0;
 * 
 * if (n == 0 || n == 1) {
 * return false;
 * } else {
 * for (int i = 2; i < n; i++) {
 * if (n % i == 0) {
 * return false;
 * 
 * }
 * }
 * return true;
 * 
 * }
 * }
 * 
 * public static void main(String[] args) {
 * int n = 89;
 * 
 * for (int i = 1; i <= n; i++) {
 * if (isPrime(i)) {
 * System.out.print(i + " ");
 * }
 * }
 * }
 * }
 */