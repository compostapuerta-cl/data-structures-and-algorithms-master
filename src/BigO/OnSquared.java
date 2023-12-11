package BigO;

public class OnSquared {

    private static void printPairs(int[] array) {
        // O(n * n) --> O(n^2)
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.printf(" [%s,%s]", array[i], array[j]);
            }
        }
    }

    public static void main(String[] args) {
        int[] boxes = new int[]{1, 2, 3};
        printPairs(boxes);
    }
}
