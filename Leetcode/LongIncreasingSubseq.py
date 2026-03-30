# Longest Continuous Increasing Subsequence
from typing import List


class Solution:
    def findLengthOfLCIS(self, nums: List[int]) -> int:
        count = 1
        maxCount = 0
        for i in range(1, len(nums)):
            if nums[i] > nums[i - 1]:
                print("count"," ",nums[i-1],"",nums[i]," ", count)
                count += 1
            else:
                maxCount = max(maxCount, count)
                print("maxCount ",maxCount)
                count = 1
        return max(maxCount, count)