# 11. Container With Most Water
from typing import List
# area = height * width
def maxArea(height: List[int]) -> int:
    left = 0
    right = len(height) - 1
    maxArea = 0
    while(left < right):
        minH = min(height[left], height[right])
        width = right - left
        currArea = minH * width
        
        maxArea = max(currArea, maxArea)
        if height[left] < height[right] :
            left += 1
        else:
            right -= 1
    return maxArea 
        
    

height = [1,8,6,2,5,4,8,3,7]
print(maxArea(height))

            




