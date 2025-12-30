import java.util.Scanner;
//Problem - https://codeforces.com/problemset/problem/1985/A
public class CreatingWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String str1 = sc.next();
            String str2 = sc.next();
            StringBuilder sb1 = new StringBuilder(str1);
            StringBuilder sb2 = new StringBuilder(str2);
            
            sb1.setCharAt(0, sb2.charAt(0));
            sb2.setCharAt(0, sb1.charAt(0));
            
            System.out.print(sb1.toString()+" ");
            System.out.print(sb2.toString());
            System.out.println();
        }   
        

        sc.close();
    }
}