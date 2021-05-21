public class enhanced {
    public static void main(String args[]) {
        int[] arr = new int[]{ 1, 2, 3, 4, 5 };

        for (int e: arr) e += 10; // Array in enhanced for loop is a copy of the original array.
        for (int e: arr) System.out.print(e + " "); // Original array is unchanged.
    }
}
