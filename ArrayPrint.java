import java.util.Scanner;

public class ArrayPrint {

    public static void main(String[] args) {
        int n;
        int[] arr = new int[10];

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arr: ");
        n = sc.nextInt();
        System.out.println("Enter the elements of arr: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}