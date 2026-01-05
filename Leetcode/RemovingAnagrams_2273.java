import java.util.ArrayList;
import java.util.Arrays;

public class RemovingAnagrams_2273 {
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        int[] count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }

        for (int c : count)
            if (c != 0)
                return false;

        return true;
    }

    public static void myApproach(String[] words) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(words));
        int idx = 0;
        while (true) {
            if (idx == list.size())
                break;

            if (idx + 1 < list.size() && isAnagram(list.get(idx), list.get(idx + 1))) {
                list.remove(idx + 1);
                idx = 0;
            } else {
                idx++;
            }
        }
        System.out.println(list);
    }

    public static void optimalApproach(String[] words) {
        // Here instead of removing the non anagram words added in the list
        ArrayList<String> list = new ArrayList<>();
        list.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            if(!isAnagram(words[i], list.get(list.size() - 1))) {
                list.add(words[i]);
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        String[] words = { "abba", "baba", "bbaa", "cd", "cd" };
        optimalApproach(words);

    }
}
