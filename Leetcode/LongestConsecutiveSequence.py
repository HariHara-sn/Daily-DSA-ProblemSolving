# Longest Consecutive Sequence means the numbers must increase by exactly +1
from typing import List
class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if not nums:
            return 0

        nums = sorted(set(nums)) # remove duplicates and also sorted
        print(nums)
        longest = 1
        current = 1

        for i in range(len(nums) - 1):
            if nums[i] + 1 == nums[i + 1]:
                current += 1
            else:
                longest = max(longest, current)
                current = 1

        return max(longest, current)