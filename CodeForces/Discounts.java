import java.util.*;

public class Discounts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            Integer[] product = new Integer[n];
            for (int i = 0; i < n; i++)
                product[i] = sc.nextInt();

            Integer[] voucher = new Integer[k];
            for (int i = 0; i < k; i++)
                voucher[i] = sc.nextInt();

            Arrays.sort(product, Collections.reverseOrder());
            Arrays.sort(voucher);

            long total = 0;
            int index = 0;

            for (int i = 0; i < k; i++) {
                int groupSize = voucher[i];

                for (int j = 0; j < groupSize - 1 && index < n; j++)
                    total += product[index++];

                // skip 1 (cheapest in the group)
                if (index < n)
                    index++;
            }

            // remaining products
            while (index < n)
                total += product[index++];

            System.out.println(total);
        }

        sc.close();
    }
}
