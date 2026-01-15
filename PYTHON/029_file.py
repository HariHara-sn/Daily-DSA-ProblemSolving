# 217. Contains Duplicate
from typing import List
class Solution:
    def bruteForce(self, nums: List[int]) -> bool:
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if nums[i] == nums[j]:
                    return True
        return False
    def sortingMethod(self, nums: List[int]) -> bool:
        nums.sort()
        for i in range(len(nums) - 1):
            if(nums[i] == nums[i + 1]):
                return True
        return False
    def hashSet(self, nums: List[int]) -> bool:
        seen = set()
        for num in nums:
            if num in seen:
                return True
            else:
                seen.add(num)
        return False

    def arrList(self, nums: List[int]) -> bool:
        arrlist = []
        for num in nums:
            if num in arrlist:
                return True
            arrlist.append(num)
        return False

    def containsDuplicate(self, nums: List[int]) -> bool:
        # return self.bruteForce(nums)    #1 but only solves 65 / 77 Test Cases Passed
        # return self.sortingMethod(nums) #2
        return self.hashSet(nums)       #3
        # return self.arrList(nums)       #4 this also doesnot pass all the cases bcoz o(n2)
        
        