import java.util.Arrays;

public class copy {
    public static void printArrayItem(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        final int[] arr1 = new int[]{1, 2, 3, 4, 5};
        final int newLen = 10;

        int[] arr2 = new int[newLen];
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
        printArrayItem(arr2);

        int[] arr3 = Arrays.copyOf(arr1, 10);
        printArrayItem(arr3);

        int[] arr4 = (int[]) arr1.clone();
        printArrayItem(arr4);
    }
}
