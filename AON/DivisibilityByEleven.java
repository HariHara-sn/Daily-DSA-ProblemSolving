/*
Problem Statement
int DivisibilityByEleven (int num);
You have to returns the number of contiguous integer fragments of 'num' that are divisible by 11.
integer fragments of a number, say 1273, are:
1, 2, 7, 3, 12, 27, 73, 127, 273 and 1273.
Example:
T1: 1215598 | OP: 4
Explanation : OP: 55, 121, 12155, and 15598 are contiguous fragments of the number 1215598 that are divisible by 11
 */
public class DivisibilityByEleven {
    public static boolean isDivisible(int num) {
        if (num % 11 == 0) {
            // System.out.println(num);
            return true;
        }
        return false;
    }

    public static int Helper(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            String res = "";

            for (int j = i; j < s.length(); j++) {
                res = res + s.charAt(j);
            
                if (isDivisible(Integer.parseInt(res))) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "1215598";
        System.out.println(Helper(s));

    }
}
