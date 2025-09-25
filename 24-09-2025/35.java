package Day10;

public class 35 {
    class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int first = 0;
        int second =0;
        int n = nums.length;
        int i=0;
        while(i<n){
            if(nums[i]==target){
                first=i;
            }
            else if(nums[i]>target){
                second = i;
                break;
            }
            i++;
        }

        if(nums[first]==target){
            return first;
        }
        else if(nums[second]>target){
            return second;
        }
        else{
            return n;
        }
    }
}   
}
