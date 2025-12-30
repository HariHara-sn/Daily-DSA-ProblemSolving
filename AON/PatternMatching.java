/*
Rule: 1[0]*1
T1 : 10001 | OP: 1
T2 : 10010001 | OP: 2
T3 : 101agc100001 | OP: 2
 */
public class PatternMatching {

    public static void main(String[] args) {
        String s = "10010001";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && s.charAt(i) == '1' && s.charAt(i + 1) == '0') {

                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(j) == '1') {
                        count++;
                        i = --j;
                        break;
                    }
                }

            }
        }
        System.out.println(count);
    }
}
