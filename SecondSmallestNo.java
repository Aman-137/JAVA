public class SecondSmallestNo {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[] { 23, 32, 43, 34, 28 };
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
        int res = arr[n - 4]; // after sorting array the second element is the second or third
                              // element is the third smallest number.

        System.out.println("The 2nd smallest no. = " + res);

    }
}
