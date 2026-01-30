import java.util.*;
class Permutation {

    List<List<Integer>> result = new ArrayList<>();

    private void backtrack(int[] arr, int start) {
        if (start == arr.length) {
            List<Integer> list = new ArrayList<>();
            for (int num : arr) 
                list.add(num);

            result.add(list);
            return;
        }

        for (int i = start; i < arr.length; i++) {
            swap(arr, start, i);
            backtrack(arr, start + 1);
            swap(arr, start, i);  // backtrack
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public List<List<Integer>> permute(int[] nums) {
        backtrack(nums, 0);
        return result;
    }

    
}