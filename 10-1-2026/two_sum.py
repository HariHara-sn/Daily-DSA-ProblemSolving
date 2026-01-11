from typing import List
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        arr_list = []
        for i in range(len(nums)):
            diff = target - nums[i]
            if diff in arr_list:
                return [arr_list.index(diff), i]
            arr_list.append(nums[i])
        return [0,0]

        