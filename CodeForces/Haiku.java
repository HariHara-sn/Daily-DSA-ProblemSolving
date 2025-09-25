import java.util.Scanner;
// Problem - https://codeforces.com/problemset/problem/78/A
public class Haiku {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] arr = new String[3];
        int[] countarr = {5, 7, 5};
        for (int i = 0; i < 3; i++) {
            arr[i] = s.nextLine();
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr[i].length(); j++) {
                if ("aeiou".contains(arr[i].charAt(j) + "")) {
                    count++;
                }
            }
            if(count != countarr[i]) {
                System.out.println("NO");
                return;
            }
            
        s.close();
        }
        System.out.println("YES");

        
    }
}
