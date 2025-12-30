/*
Problem : Longest SubString of 2Unique char
T1 : qwertyytrewq | OP: tyyt
T2 : abbccc | OP: bbccc

 */
//Note : Still not completed
import java.util.ArrayList;

public class LongestSubString {
    public static void main(String[] args) {
        // String s = "qwertyytrewq";
        String s = "abbccc";
        ArrayList<Character> list = new ArrayList<>();
        ArrayList<ArrayList<Character>> res = new ArrayList<>();

        for (char e : s.toCharArray()) {
            if (list.size() >= 2) {
                if (!list.contains(e)) {
                    res.add(new ArrayList<>(list));
                    list.removeAll(list);
                }
            }
            list.add(e);
        }
        System.out.println(res);
        int max = -100 , idx = 0;
        for (int i = 0; i < res.size(); i++) {
            if(res.get(i).size() > max) {
                max = res.get(i).size();
                idx = i;
            }
        }
        System.out.println(res.get(idx));
    }
}
