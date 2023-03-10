import java.util.Scanner;

public class ArrayReverse {
    static void reverseArr(int arr[], int left, int right) {
        int temp;

        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

    }

    static void printArr(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
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

        System.out.print("Original Array: ");
        printArr(arr, n);
        reverseArr(arr, 0, n - 1);
        System.out.print("Reverse Array: ");
        printArr(arr, n);

    }
}
