import java.util.*;

public class SkibidusAndOhio {
    public static int skibidusOhio(String s) {
        boolean hasPair = false;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                hasPair = true;
                break;
            }
        }

        if (hasPair) 
            return 1;
        else 
            return s.length();
        
    }

    public static void main(String[] args) {
        /* 
         INPUT's
        4
        baa
        skibidus
        cc
         */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            String s = sc.next();
            System.out.println(skibidusOhio(s));
        }

        sc.close();
    }

}
