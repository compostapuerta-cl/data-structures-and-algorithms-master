package BigO;

import java.util.Arrays;

public class On {

    private static void findNemo(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("Nemo")) {
                System.out.println("Found NEMO!");
            }
        }
    }

    public static void main(String[] args) {
        String[] everyone = new String[]{"Dory", "Bruce", "Marlin", "Nemo", "Gill", "Hank"};
        String[] large = new String[10000];
        Arrays.fill(large, "Nemo");
        findNemo(large); // O(n) --> Linear
    }
}
