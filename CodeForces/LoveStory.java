import java.util.Scanner;

public class LoveStory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String str = sc.next();
            String pattern = "codeforces";
            int count = 0, i = 0;
            for (char e : str.toCharArray()) {
                if (e != pattern.charAt(i++)) {
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
