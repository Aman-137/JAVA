public class ArrayLength {

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 3, 4, 2, 4, 5 };

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
        }

        System.out.println("The number of element in arr = " + count);
    }
}
