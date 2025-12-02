import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MaxRepeatingSubstring {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.
        String sequence = "abcabc";
        String word = "ab";

        int count = maxRepeating(sequence, word);
        System.out.println(count);
    }

    public static int maxRepeating(String sequence, String word) {
        int count = 0;
        StringBuilder sb = new StringBuilder(sequence);
        while(sb.toString().contains(word)) {
            count++;
            sb.deleteCharAt(word);
        }

        return count;
    }
}
