package Day11;
import java.util.Arrays;
import java.util.Scanner;

public class TalesofaSort {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int k=0;k<t;k++){
            int n = sc.nextInt();

        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] arr1 = arr.clone();

        Arrays.sort(arr);

        int max=0;
        for(int i=0;i<n;i++){
            if(arr1[i]!=arr[i]){
                if(arr1[i]>max){
                    max=arr1[i];
                }
            }
        }

        System.out.println(max);
        }
    }
}
