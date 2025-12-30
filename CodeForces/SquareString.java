import java.util.Scanner;
//Problem - https://codeforces.com/problemset/problem/1619/A
public class SquareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String str = sc.next();
            if (str.length() == 1) {
                System.out.println("No");
                continue;
            }
            int size = str.length() / 2;
            String s1 = str.substring(0, size);
            String s2 = str.substring(size);
            String res = s1.equals(s2) ? "YES" : "NO";
            System.out.println(res);
        }
        sc.close();
    }
}
