package Day11;

import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int n2 = n*2;
        int[] arr = new int[n2];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int sum=0;

        int max=0;

        for(int i=0;i<n2;i++){
            if(i%2==0){
                sum= sum-arr[i];
                
            }
            else{
                sum=sum+arr[i];
                if(sum>max){
                    max=sum;
                }
            }
        }

        System.out.println(max);

        sc.close();
    }
}
