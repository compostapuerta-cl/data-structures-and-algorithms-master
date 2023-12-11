package InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

/*
 * Solutions to the problem presented in Google's Example Coding interview video
 * https://www.youtube.com/watch?v=XKu_SEDAykw
 */
public class PairWithSum {

    private static boolean hasPairWithSumNaive(int[] array, int sum) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[i] + array[j] == sum) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean hasPairWithSumBetter(int[] array, int sum) {
        Set<Integer> mySet = new HashSet<Integer>();

        for (int i = 0; i < array.length; i++) {
            if (mySet.contains(array[i])) {
                return true;
            }
            mySet.add(sum - array[i]);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] array = new int[]{3, 5, 6, 2, 2, 4, 6, 1, 5, 9};
        int sum = 3;

        boolean naiveSolutionResult = hasPairWithSumNaive(array, sum); // O(n^2) Time complexity
        boolean betterSolutionResult = hasPairWithSumBetter(array, sum); // O(n) Time complexity

        System.out.println(betterSolutionResult);

    }
}
