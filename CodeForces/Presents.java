import java.util.Scanner;

public class Presents {
    // Problem - https://codeforces.com/problemset/problem/136/A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] inputArr = new int[size];
        for (int i = 0; i < size; i++) {
            inputArr[i] = sc.nextInt();
        }
        //start
        int[] outputAr = new int[size];
        int idx = 0;
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == inputArr[j]) {
                    outputAr[idx++] = j + 1;
                    break;
                }
            }
        }
        for (int i = 0; i < outputAr.length; i++) {
            System.out.print(outputAr[i] + " ");
        }
        sc.close();
    }
}
