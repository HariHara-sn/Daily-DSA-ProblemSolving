//3074. Apple Redistribution into Boxes

/*
✔️ Example 1
apple = [1, 3, 2] → total apples = 6
capacity = [4, 3, 1, 5, 2] (sort descending → 5, 4, 3, 2, 1)

Pick boxes:
First 5 → total = 5
Next 4 → total = 9 (now ≥ 6)
    So you used 2 boxes.

✔️ Example 2
apple = [5,5,5] → total apples = 15
capacity = [2,4,2,7] (sorted → 7, 4, 2, 2)

Pick boxes:
7 → total = 7
4 → total = 11
2 → total = 13
2 → total = 15 (done!)
    Used 4 boxes.
*/
public class AppleRedistribution {

    public static int Total(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        return sum;
    }

    public static int[] desOrder(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] apple = { 5, 5, 5 };
        int[] capacity = { 2, 4, 2, 7 };

        int appleSum = Total(apple);
        capacity = desOrder(capacity);
        
        for (int i = 0; i < capacity.length; i++) {
            if (appleSum <= 0) {
                System.out.println(i);
                return;
            }
            appleSum = appleSum - capacity[i];
        }
        System.out.println(capacity.length);

    }
}
