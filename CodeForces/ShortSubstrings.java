import java.util.Scanner;
// Problem - https://codeforces.com/problemset/problem/1367/A
public class ShortSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i += 2) {
                sb.append(s.charAt(i));
            }
            sb.append(s.charAt(s.length() - 1)); 
            System.out.println(sb);
        }
        sc.close();
    }
}
