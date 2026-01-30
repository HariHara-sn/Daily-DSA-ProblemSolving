from typing import List
class Solution:
    # def __init__(self):
        # self.result = []
    result = []

    def swap(self, arr, i, j):
        arr[i], arr[j] = arr[j], arr[i]

    def backtrack(self, arr, start):
        if start == len(arr):
            self.result.append(arr.copy())  
            return

        for i in range(start, len(arr)):
            self.swap(arr, start, i)
            self.backtrack(arr, start + 1)
            self.swap(arr, start, i)  # backtrack

    def permute(self, nums: List[int]) -> List[List[int]]:
        self.backtrack(nums, 0)
        return self.result

permu = Solution()
print(permu.permute([0, 1]))