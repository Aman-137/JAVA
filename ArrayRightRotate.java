import java.util.Scanner;

public class ArrayRightRotate {

    static int[] rightRotate(int arr[], int n, int k) {

        for (int i = 0; i < k; i++) {
            int j;
            int last = arr[arr.length - 1];
            for (j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
        return arr;

    }

    static void printArr(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int k = 1;

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arr: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of arr: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Original Array = ");
        printArr(arr, n);
        System.out.println();
        System.out.println("The rotated arr is : ");
        rightRotate(arr, n, k);
        printArr(arr, n);

    }
}
