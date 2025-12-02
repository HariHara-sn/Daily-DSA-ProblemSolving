import java.util.*;
/*
T1 : words = ["w","wo","wor","worl","world"] | output : "world"
T2 : words = ["a","banana","app","appl","ap","apply","apple"] | output: "apple"
T3 : words = ["m","mo","moc","moch","mocha","l","la","lat","latt","latte","c","ca","cat"] | output : "latte"
T4 : words = ["yo","ew","fc","zrc","yodn","fcm","qm","qmo","fcmz","z","ewq","yod","ewqz","y"] | output : "yodn"

 */
class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        ArrayList<String> list = new ArrayList<>();
        // System.out.println(Arrays.toString(words));
        for (String e : words) {
            list.add(e);
        }
        String res = "";
        for (int i = 0; i < words.length; i++) {

            if (list.contains(words[i].substring(0, words[i].length() - 1)) || words[i].length() == 1) {
                if (words[i].length() > res.length()) {
                    res = words[i];
                }
            } else {
                list.remove(words[i]);
            }
        }
        return res;
    }
}

public class LongestWordDictionary {
    public static void main(String[] args) {

    }
}
