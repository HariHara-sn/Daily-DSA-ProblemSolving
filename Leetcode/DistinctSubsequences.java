import java.sql.Array;
import java.util.Arrays;

public class DistinctSubsequences {
    public static void main(String[] args) {
        String s = "babgbag";
        String t = "bag";
        int tlen = t.length();
        int[] prev = new int[tlen + 1];
        prev[0] = 1;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = tlen; j >= 1; j--) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    prev[j] = prev[j] + prev[j - 1];
                    System.out.println(Arrays.toString(prev));

                }
            }
        }
        System.out.println(prev[tlen]);

    }
}
