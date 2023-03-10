/* 
class Fibonacci {

    static int n1 = 0, n2 = 1, n3 = 0;

    public static void fib(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            System.out.print(" " + n3);
            fib(count - 1);
        }
    }

    public static void main(String[] args) {
        int count = 10;
        System.out.print(n1 + " " + n2);
        fib(count - 2);
    }
}*/

class Fibonacci {

    static int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println(fib(n));
    }
}