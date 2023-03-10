import java.util.Scanner;

public class ArraySum {

    static int sumOfArray(int arr[], int n) {

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arr: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of arr: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("The sum of the arr is = " + sumOfArray(arr, n));

    }
}