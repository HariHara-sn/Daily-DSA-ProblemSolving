import java.util.*;

class Solution {
    public int findKthSmallest(int[] nums, int k) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        for (int num : nums) {
            minheap.add(num);
        }

        for (int i = 1; i < k; i++) {
            System.out.println(minheap);
            minheap.poll();
        }
        return minheap.poll();
    }
}

public class KthSmallestElement {
    public static void main(String[] args) {
        int[] nums = { 3, 1, 5, 2, 6, 4 };
        int k = 2;
        Solution soln = new Solution();
        int res = soln.findKthSmallest(nums, k);

        System.out.println(res);
    }
}
