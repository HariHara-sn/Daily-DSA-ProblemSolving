import java.util.ArrayList;
import java.util.Scanner;
//Problem - https://codeforces.com/problemset/problem/855/A
public class TomRiddleDiary {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        scan.nextLine();
        while (scan.hasNext()) {
            String input = scan.next();
            if (!list.contains(input)) {
                System.out.println("No");
                list.add(input);
            } else {
                System.out.println("Yes");
            }
        }
        scan.close();

    }
}
