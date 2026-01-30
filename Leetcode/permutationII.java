import java.util.*;

public class permutationII {

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
            swap(arr, start, i); // backtrack
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static List<List<Integer>> removeDuplicatesLinkedHashSet(List<List<Integer>> list) {
        LinkedHashSet<List<Integer>> res = new LinkedHashSet<>(list);

        return new ArrayList<>(res); // this main order in (sorted)
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        backtrack(nums, 0);
        return removeDuplicatesLinkedHashSet(result);
    }

    public static void main(String[] args) {
        permutationII obj = new permutationII();
        System.out.println(obj.permuteUnique(new int[] { 1, 2, 3 }));

    }
}
