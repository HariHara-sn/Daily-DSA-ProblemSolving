import java.util.Scanner;

public class Elfucho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int num = sc.nextInt();
            if (num == 2) {
                System.out.println(num);
            } 
            else {
                int temp = 0;
                for (int i = 3; i <= num; i++) {
                    temp++;
                }
                System.out.println(temp + num);
            }
        }
        sc.close();
    }
}
