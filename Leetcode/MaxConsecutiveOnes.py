class Solution:
    def findMaxConsecutiveOnes(self, nums) -> int:
        count = 0
        maxCount = -1
        for i in nums:
            if i == 1:
                count += 1
            else:
                maxCount = max(maxCount, count)
                count = 0
        maxCount = max(maxCount, count)
        
        return maxCount

Solution().findMaxConsecutiveOnes([1,1,0,1,1,1])  # 3