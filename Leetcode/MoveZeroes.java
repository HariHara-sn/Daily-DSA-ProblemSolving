import java.util.Arrays;

public class MoveZeroes {
    public static void Method1(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }
        for (int i = index; i < arr.length; i++) {
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void Method2(int[] arr) {
        int nonZero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[nonZero];
                arr[nonZero] = temp;

                nonZero++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 0, 3, 0, 4, 5 };
        Method1(arr);
        Method2(arr);

    }
}