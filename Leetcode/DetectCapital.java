// 520. Detect Capital

import java.lang.reflect.Array;
import java.util.Arrays;

public class DetectCapital {

    public static boolean isAllUpperCase(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!(ch >= 'A' && ch <= 'Z')) {
                return false;
            }
        }
        return true;
    }
    public static boolean isAllLowerCase(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!(ch >= 'a' && ch <= 'z')) {
                return false;
            }
        }
        return true;
    }
    public static boolean isFirstUpperRestLower(String s) {
        char chr = s.charAt(0);
        if(!(chr >= 'A' && chr <= 'Z')) 
            return false;
        
        return isAllLowerCase(s.substring(1));

    }

    public static void main(String[] args) {
        // A - 65, Z - 90 || a - 97, z - 122

        String s = "FlaG";
        if (isAllUpperCase(s)) {
            System.out.println(true);
        } 
        else if (isAllLowerCase(s)) {
            System.out.println(true);
        }
        else if(isFirstUpperRestLower(s)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

    }
}