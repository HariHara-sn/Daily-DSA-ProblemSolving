import java.util.Scanner;

public class CandiesNephews {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        // while (t-- > 0) {
        // int n = sc.nextInt();
        // int count = (3 - n % 3) % 3;
        // System.out.println(count);
        // }

        while (t-- > 0) {
            int n = sc.nextInt();
            int count = 0;
            while (n % 3 != 0) {
                n++;
                count++;
            }
            System.out.println(count);
        }
        sc.close();

    }
}
