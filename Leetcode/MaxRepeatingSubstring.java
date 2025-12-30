import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MaxRepeatingSubstring {
    public static void main(String[] args) { 
        String sequence = "ababc";
        String word = "ab";
        submittedSolution(sequence, word); //but it fail for abcabc input to solve this check maxRepeating() fun
        // maxRepeating(sequence, word);
    }

    public static void maxRepeating(String sequence, String word) {
        int count = 0;
        StringBuilder sb = new StringBuilder(sequence);
        while(sb.toString().contains(word)) {
            count++;
            sb.deleteCharAt(word);
        }
        System.out.println(count);
        
    }

    public static void submittedSolution(String seq, String word) {
        int count = 0;
        String res = word;
        while (seq.contains(res)) {
            count++;
            res = res + word;
        }
        System.out.println(count);
    }
}
