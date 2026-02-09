class Main {
    public static void main(String[] args) {
        int[] arr = { -1, 2, -3, 4 };
        int currSum = 0;
        int maxSum = arr[0];
        for (int i : arr) {
            currSum = Math.max(currSum + i, currSum);
            maxSum = Math.max(maxSum, currSum);
            System.out.println(maxSum);
        }
    }
}
