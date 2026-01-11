// 383. Ransom Note
// return magazine.startsWith(ransomNote);  - 39 / 130 testcases passed
public class RandsomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {

        int[] freq = new int[26];

        for (char c : magazine.toCharArray()) {
            freq[c - 'a']++;
        }

        for (char ch : ransomNote.toCharArray()) {
            if (freq[ch - 'a'] == 0) {
                return false;
            }
            freq[ch - 'a']--;
        }

        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "aab";
        String magazine = "baa";
        System.out.println(canConstruct(ransomNote, magazine));

    }
}