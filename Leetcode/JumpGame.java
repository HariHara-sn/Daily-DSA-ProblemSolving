
public class JumpGame {
    public boolean canJump(int[] nums) {
        int maxReachable = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReachable) {
                return false;
            }
            maxReachable = Math.max(maxReachable, i + nums[i]);
            System.out.println(maxReachable);
        } 
        return true;
    }
    //Hi Hello
    public static void main(String[] args) {
        JumpGame jg = new JumpGame();
        int[] nums = {3, 2, 1, 0, 4};
        System.out.println(jg.canJump(nums)); 
    }
}

/*
This code pass - 71 / 175 testcases passed
    public boolean canJump(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i] + (i + 1);
            if (sum == nums.length) {
                return true;
            }
        }
        return false;      
}
*/