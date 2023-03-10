import java.util.Scanner;

public class EvenPosition {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arr: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements : ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.print("Original Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        System.out.print("Even Positioned element: ");
        for (int i = 0; i < n; i++) {

            if (i % 2 == 0)
                System.out.print(arr[i] + " ");
        }

        System.out.println();

        System.out.print("Odd Positioned element: ");
        for (int i = 0; i < n; i++) {

            if (i % 2 != 0)
                System.out.print(arr[i] + " ");
        }

    }
}
