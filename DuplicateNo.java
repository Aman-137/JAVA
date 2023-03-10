import java.util.Scanner;

public class DuplicateNo {

    static int printDuplicate(int arr[], int n) {

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j])
                    return arr[i];
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int n;
        int[] arr = new int[10];

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arr : ");
        n = sc.nextInt();

        System.out.println("Enter the element of arr : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        System.out.print("The duplicate element is = " + printDuplicate(arr, n));

    }
}