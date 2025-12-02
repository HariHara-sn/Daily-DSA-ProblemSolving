import java.util.*;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        for (int num : nums) {
            minheap.offer(num);
            if (minheap.size() > k) {
                minheap.poll();
            }
        }
        return minheap.poll();
    }
}

public class KthLargestElement {

    public static void main(String[] args) {
        int[] nums = { 3, 2, 1, 5, 6, 4 };
        int k = 2;
        Solution soln = new Solution();
        int res = soln.findKthLargest(nums, k);

        System.out.println(res);
    }
}
