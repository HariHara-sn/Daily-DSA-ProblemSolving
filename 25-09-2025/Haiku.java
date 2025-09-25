package Day11;

import java.util.Scanner;

public class Haiku{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String[] str = new String[3];
        int[] countarr = {5,7,5};

        for(int i=0;i<3;i++){
            str[i]=sc.nextLine();
        }

        
        int count=0;
        for(int i=0;i<str.length;i++){
            count=0;
            for(int j=0;j<str[i].length();j++){
                if("aeiou".contains(str[i].charAt(j)+"")){
                    count++;
                };
            }

            if(count!=countarr[i]){
                System.out.println("NO");
                return;
            }
        }

        
        System.out.println("YES"); 
        
        sc.close();
    }
}
