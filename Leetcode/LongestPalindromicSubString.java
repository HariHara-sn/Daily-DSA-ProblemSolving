public class LongestPalindromicSubString {
    public static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if( str.charAt(i) != str.charAt(j) ) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static String longestPalindrome(String str) {
        if (str == null || str.length() < 2) return str;
        String longestString = "";
        for(int  i = 0; i < str.length(); i++) {
            for(int j = i + 1; j <= str.length(); j++) {
                String sub = str.substring(i, j);
                if( isPalindrome(sub) && sub.length() > longestString.length()) {
                    longestString = sub;
                }
            }
        }
        return longestString;
    }
    public static void main(String[] args) {

        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
}