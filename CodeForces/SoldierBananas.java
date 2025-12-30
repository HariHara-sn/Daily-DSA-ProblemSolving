import java.util.Scanner;

public class SoldierBananas {
    // Problem - https://codeforces.com/problemset/problem/546/A
    /*
     * k = 3 → first banana costs $3
     * n = 17 → he already has $17
     * w = 4 → he wants 4 bananas
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bananaRate = sc.nextInt(); 
        int amountHave = sc.nextInt(); 
        int totalBananasNeeded = sc.nextInt(); 

        int costPrice = 0;
        for (int i = 1; i <= totalBananasNeeded; i++) {
            costPrice += bananaRate * i; 
        }

        int borrow = costPrice - amountHave; 
        if (borrow > 0) {
            System.out.println(borrow);
        } else {
            System.out.println(0);
        }

        sc.close();

    }
}
