class Solution:
    def duplicateZeros(self, arr: List[int]) -> None:
        res = []
        
        for num in arr:
            if len(res) < len(arr):
                res.append(num)
            
            if num == 0 and len(res) < len(arr):
                res.append(0)

        for i in range(len(arr)):
            arr[i] = res[i]