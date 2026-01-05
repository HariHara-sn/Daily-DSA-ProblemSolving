#Search in Rotated Sorted Array
'''
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4

Example 2:
Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1

Example 3:
Input: nums = [1], target = 0
Output: -1
'''
nums = [4,5,6,7,0,1,2]
target = 0
for i in range(len(nums)):
    if nums[i] == target:
        print(i)
        break