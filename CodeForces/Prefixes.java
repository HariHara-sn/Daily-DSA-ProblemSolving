import java.util.Scanner;
// Input 
// int num = 4; 
// String s = "bbbb"; 
// int num = 6; 
// String s = "ababab"; 
// int num = 2; 
// String s = "aa";
public class Prefixes {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();

        int count = 0;
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < n; i += 2) {
            if (sb.charAt(i) == sb.charAt(i + 1)) {
                count++;
                if (sb.charAt(i) == 'a') {
                    sb.setCharAt(i + 1, 'b');
                } else {
                    sb.setCharAt(i + 1, 'a');
                }
            }
        }

        System.out.println(count);
        System.out.println(sb.toString());
        sc.close();
    }
}
