import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // number of stops
        int current = 0;       // current passengers
        int maxCapacity = 0;   // max needed capacity

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(); // exits
            int b = sc.nextInt(); // enters
            current -= a;         // first exit
            current += b;         // then enter
            maxCapacity = Math.max(maxCapacity, current);
        }

        System.out.println(maxCapacity);
        sc.close();
    }
}
