package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

/*
 *  Section 4, Class 55 and 56
 */
public class InterviewQuestion {

    private static boolean containsCommonItem(char[] arr1, char[] arr2) {
        // loop through first array and create Map, where properties (keys) == items in the array
        Map<Character, Boolean> map = new HashMap<Character, Boolean>();

        for (int i = 0; i < arr1.length; i++) {
            if (!map.containsKey(arr1[i])) {
                char item = arr1[i];
                map.put(item, true);
            }
        }

        // loop through second array and check if item in second array exists on created map
        for (int i = 0; i < arr2.length; i++) {
            if (map.containsKey(arr2[i])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[] array1 = new char[]{'b', 'c', 'a'};
        char[] array2 = new char[]{'z', 'y', 'a'};

        boolean result = containsCommonItem(array1, array2); // O(a + b) Time complexity
        System.out.println(result);
    }
}
