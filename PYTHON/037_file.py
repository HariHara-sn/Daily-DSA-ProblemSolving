# leaders in arr
#method 1
class Solution:
        
    def leaders(self, arr):
        # code here
        stack = []
        stack.append(arr[-1])
        for i in range(len(arr) - 1)[::-1]:
            
            if arr[i] >= stack[0]:
                stack.insert(0, arr[i])
        return stack
    
class Solution:

    def isleader(self, arr, idx):
        num = arr[idx]
        total = sum(arr[idx+1:])
        if num >= total:
            return True
        return False
        
    def leaders(self, arr):
        # code here
        result = []
        for i in range(len(arr)):
            if self.isleader(arr, i):
                result.append(arr[i])
        return result
        