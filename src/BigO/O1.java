package BigO;

public class O1 {

    private static void printFirstTwoBoxes(int[] boxes) {
        System.out.println(boxes[0]); // O(1)
        System.out.println(boxes[1]); // O(1)
    }

    public static void main(String[] args) {
        int[] boxes = new int[]{0, 1, 2, 3, 4, 5};
        printFirstTwoBoxes(boxes); // O(2)
    }
}
