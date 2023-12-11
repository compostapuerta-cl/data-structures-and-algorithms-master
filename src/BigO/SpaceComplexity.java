package BigO;

import java.util.Arrays;

public class SpaceComplexity {

    private static void boooo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Booo!");
        }
    }

    private static String[] arrayOfHiNTimes(int n) {
        String[] hiArray = new String[n];
        for (int i = 0; i < n; i++) {
            hiArray[i] = "Hi";
        }
        return hiArray;
    }

    public static void main(String[] args) {
        int[] n = new int[]{1, 2, 3, 4, 5};
        boooo(n);
        System.out.println(Arrays.toString(arrayOfHiNTimes(6)));
    }

}
