public class Main {

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 0, 3, 0, 5, 5 };
        int j = 0; // filter
        for (int i = 0; i < arr.length; i++) {
            if (arr[j] != 0) {
                j++;
            } else {
                while (arr[j] != 0) {
                    j++;
                    arr[j] = arr[i];
                }
            }
        }
        j++;
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}