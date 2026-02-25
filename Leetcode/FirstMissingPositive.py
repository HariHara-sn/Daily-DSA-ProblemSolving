from typing import List

class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        nums_set = set(nums)      # O(n)
        
        for i in range(1, len(nums) + 2):   # O(n)
            if i not in nums_set:           # O(1)
                return i

# If you didnt use the set the membership check in a list scans the whole list.
# O(n) * O(n) = O(n²) to solve this use set() for O(1) look up