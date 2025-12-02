import java.util.HashMap;
import java.util.Map;

public class MostCommonWord {
    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = { "hit" };

        String res = Solution.mostCommonWord(paragraph, banned);
        System.out.println(res);
    }
}

class Solution {
    public static String mostCommonWord(String paragraph, String[] banned) {
        String word = paragraph.toLowerCase().replaceAll("[^a-z\\s]", " ");
        String[] arr = word.split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();
        for (String e : arr) {
            map.put(e, map.getOrDefault(e, 0) + 1);
        }
        for(String ban : banned) {
            map.remove(ban);
        }

        String mostFreqWord = "";
        int max = Integer.MIN_VALUE;
        for (Map.Entry<String,Integer> ele : map.entrySet()) {
            if(ele.getValue() > max) {
                max = ele.getValue();
                mostFreqWord = ele.getKey();
            }
        }
        return mostFreqWord;
    }
}