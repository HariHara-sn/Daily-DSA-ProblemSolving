class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;

        int i=0;
        // int j=n-1;

        int firstpos = -1;

        while(i<n){
            if(nums[i] == target){
                firstpos = i;
                break;
            }
            i++;
        }
        
        int lastpos = -1;

        while(i<n){
            if(nums[i] == target){
                lastpos = i;
            }
            if(nums[i] != target){
                break;
            }
            i++;
        }
        // int j=0;
        // while(j<n){
        //     if(nums[j] == target){
        //         lastpos = j;
        //     }
        //     j++;
        // }

        return new int[]{firstpos,lastpos};
    }
}