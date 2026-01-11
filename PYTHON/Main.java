
//ctrl + ` = focus terminal

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        
        for (String word : strs) {
            int[] freq = new int[26];
            for (char ch : word.toCharArray()) {
                freq[ch - 'a']++;
            }
            String key = Arrays.toString(freq);

            if (map.containsKey(key)) {
                map.get(key).add(word);
            } else {
                map.put(key, new ArrayList<>(List.of(word)));
            }
        }
        System.out.println(map.values());
    }
}
