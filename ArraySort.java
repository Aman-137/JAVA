import java.util.Scanner;

public class ArraySort {

    static int[] sortArr(int arr[], int n) {
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        return arr;
    }

    // 1 2 3 4 5;
    // i j

    static void printArr(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arr: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the element of arr: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("Original Array: ");
        printArr(arr, n);
        System.out.println();
        System.out.println("Sorted Array: ");
        sortArr(arr, n);
        printArr(arr, n);
    }
}
