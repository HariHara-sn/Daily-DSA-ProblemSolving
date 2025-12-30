import java.util.Scanner;
//Problem - https://codeforces.com/problemset/problem/214/A
public class SystemEquations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;

        for (int a = 0; a <= 1000; a++) {
            int b = n - (a * a);
            if (b >= 0 && (a + (b * b) == m)) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
