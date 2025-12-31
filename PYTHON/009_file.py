#Find Peak Element
arr = [1,2,1,3,5,6,4]
j = 0
for i in range(1, len(arr)):
    if not arr[j] < arr[i]:
        print(j) #return idx
        break
    j += 1

"""
Input: nums = [1,2,3,1]
Output: 2
Input: nums = [1,2,1,3,5,6,4]
Output: 5
"""

