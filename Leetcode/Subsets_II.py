from typing import List
# for undeerstanding see backtracking folder
class Solution:
    def possibleSubSet(self, nums):
        result = []
        current = []
        def backtrack(i):
            if i == len(nums):
                result.append(current.copy())
                return 
            current.append(nums[i])
            backtrack(i + 1)
            current.pop()
            backtrack(i + 1)
        backtrack(0)
        return result
    
    
    def removeduplicated(self, nums):
        unique = set()
        for i in nums:
            unique.add(tuple(i))
        # lst = [x for x in unique]
        # print(lst)
        return [x for x in unique]

    def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:
        nums = self.possibleSubSet(nums)
        return self.removeduplicated(nums)

sol = Solution()
print(sol.subsetsWithDup([1,2,3]))