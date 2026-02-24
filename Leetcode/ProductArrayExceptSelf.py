'''
https://leetcode.com/problems/product-of-array-except-self/
see - previous submission for understanding and explaintion
'''
from ast import List

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = [1] * len(nums)
        prefix = 1
        for i in range(len(nums)):
            res[i] = res[i] * prefix
            prefix = prefix * nums[i]

        suffix = 1
        for i in range(len(nums))[::-1]:
            res[i] = res[i] * suffix
            suffix = suffix * nums[i]

        return res
        