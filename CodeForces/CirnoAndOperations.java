//Problem -  https://codeforces.com/problemset/problem/2062/C
import java.util.*;
//Accepted
public class CirnoAndOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextLong();

            long ans = 0;
            for (long x : arr) ans += x; // sum of array

            long currSum = ans;

            int len = n;
            while (len > 1) {
                // build difference array
                for (int i = 0; i < len - 1; i++) {
                    arr[i] = arr[i + 1] - arr[i];
                }
                len--;

                // compute sum and take max of absolute
                currSum = 0;
                for (int i = 0; i < len; i++) 
                    currSum += arr[i];

                ans = Math.max(ans, Math.abs(currSum));
            }

            System.out.println(ans);
        }
        sc.close();
    }
}
