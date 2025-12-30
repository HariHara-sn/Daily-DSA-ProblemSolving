import java.util.*;

public class StringsEqualization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();  
        sc.nextLine(); 

        while (t-- > 0) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            
            if (canBeEqual(s1, s2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }

    public static boolean canBeEqual(String s, String t) {
        boolean[] freq = new boolean[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a'] = true;
        }

        for (char c : t.toCharArray()) {
            if (freq[c - 'a']) {
                System.out.println("Hari"+c);
                return true; 
            }
        }

        return false; 
    }
}
