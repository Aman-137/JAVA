// public class ArrayLargestEle {

//     public static void main(String[] args) {
//         int n = 5;
//         int[] arr = new int[] { 25, 11, 28, 45, 34 };

//         int max = arr[0];

//         for (int i = 0; i < n; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         System.out.println("Maximum number in arr = " + max);
//     }
// }

public class ArrayLargestEle {

    static int maxElement(int arr[]) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    static int minElement(int arr[]) {

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    public static void main(String[] args) {

        int[] arr = new int[] { 1, 2, 3, 14, 5 };
        System.out.println("Maximum Element = " + maxElement(arr));
        System.out.println("Minimum Element = " + minElement(arr));
    }
}
