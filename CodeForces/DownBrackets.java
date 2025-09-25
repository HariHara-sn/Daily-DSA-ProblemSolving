/* Input:
4
(())
(())()()
()
(())(())
*/

import java.util.Scanner;

public class DownBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();   // number of test cases
      
        while (t-- > 0) {
        int open = 0;
        int f = 0;
            String s = sc.next();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(')  
                    open++;
                if (s.charAt(i) == ')') 
                    open--;
                if (open == 0 && i != s.length() - 1) //no if-else only if condition
                    f = 1;
                
            } 
            if (f == 1) 
                System.out.println("Yes");
            else 
                System.out.println("No");
            
        }
        
        sc.close();
    }
}
