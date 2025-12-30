import java.util.Arrays;
import java.util.Scanner;
//Problem - https://codeforces.com/problemset/problem/1552/A
public class SubsequencePermutation {
    public static char[] toSort(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return arr;
    }
    public static int isMissMatch(char[] arr, char[] sorted_arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != sorted_arr[i]) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int size = sc.nextInt();
            String s = sc.next();
            char[] arr = s.toCharArray();
            char[] sorted_arr = toSort(s);
            // System.out.println(Arrays.toString(sorted_arr));

            System.out.println(isMissMatch(arr, sorted_arr));
        }
        sc.close();
    }
}
