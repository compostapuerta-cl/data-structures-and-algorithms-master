package BigO;

/*
 *  Find 1st, find Nth...
 */
public class TwitterExercise {

    public static void main(String[] args) {
        String[] tweets = new String[]{"Hi!!", "Coding, a thread", "I'm Learning"};
        String oldest = tweets[0]; // 0(1)
        String latest = tweets[tweets.length - 1]; // O(1)
    }
}
