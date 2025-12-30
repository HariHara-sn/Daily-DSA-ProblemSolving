import java.util.Scanner;
//Problem - https://codeforces.com/problemset/problem/1684/A
public class DigitMinimization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        while (t-- > 0) {
            String n = sc.next(); 
            if (n.length() == 2) {
                System.out.println(n.charAt(1));
            } else {
                char minDigit = '9'; //set min digit as max
                for (char c : n.toCharArray()) {
                    if (c < minDigit) {
                        minDigit = c;
                    }
                }
                System.out.println(minDigit);
            }
        }
        sc.close();
    }
}
