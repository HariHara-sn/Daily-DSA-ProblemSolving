import java.util.HashMap;
/*
Input: s = "ABAB", k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.

Example 2:
Input: s = "AABABBA", k = 1
Output: 4
Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
The substring "BBBB" has the longest repeating letters, which is 4.
There may exists other ways to achieve this answer too.

 */

public class LongestRepeatingCharReplacement {
    public static int maxFreq(String s) {
        char[] str = s.toCharArray();

        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (HashMap.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // windowSize - mostFrequentCharCount <= k
        // windowSize is just the length of the current substring we are checking.
        // The number of characters in this window is: right - left + 1
        // BASE CASE = right pointer reaches the end of the string

        String s = "AABABBA";
        int k = 1;

        int maxFreq = 0, windowSize = 0;
        int left = 0;
        int result = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            map.put(c, map.getOrDefault(c, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(c));

            windowSize = i - left + 1;
            //if invalid then below will execute
            while (windowSize - maxFreq > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1); // before shrink remove the freq of that char and shrink
                left++; // shrink

                windowSize = i - left + 1; // expand
            }
            // Track largest valid window
            result = Math.max(result, windowSize);
        }
        System.out.println(map);
        System.out.println(result);

    }
}