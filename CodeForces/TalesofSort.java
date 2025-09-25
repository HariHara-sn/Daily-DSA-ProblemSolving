import java.util.Arrays;
import java.util.Scanner;
// Problem - https://codeforces.com/problemset/problem/1856/A
public class TalesofSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1 2 3
        // 3 2 1

        // 1 3 4 5 - sort
        // 3 1 5 4 -- org
        
        int t = sc.nextInt();
        while (t-- > 0) {
 
            int len = sc.nextInt();
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = sc.nextInt();
            }
 
            int[] temp = arr.clone();
            Arrays.sort(arr);
            int max = 0;
            for (int i = 0; i < temp.length; i++) {
                if (arr[i] != temp[i]) {
                    if(temp[i] > max) {
                        max = temp[i];
                    }
                }
            }
            System.out.println(max);
        }
        sc.close(); 
    }
}
