from typing import List

# below code only pass = 140 / 152 testcases 
def addToArrayForm(self, num: List[int], k: int) -> List[int]:
    res_str = "".join(map(str,num))
    
    total = int(res_str)
    total += k
    
    return list(map(int, str(total)))
# optimized code
def addToArrayForm(self, num: List[int], k: int) -> List[int]:
        res = []

        # iterate from the last digit backward
        for i in range(len(num) - 1, -1, -1):
            total = num[i] + k
            res.insert(0, total % 10)
            k = total // 10

        # if k still has digits left, keep adding them to the front
        while k > 0:
            res.insert(0, k % 10)
            k //= 10

        return res
'''
This code solves - 140 / 152 testcases passed
class Solution:
    def arrToint(self, arr : List[int]):
        num_str = ""
        for i in arr:
            num_str = num_str + str(i)
        return num_str
    def numTolist(self, num_str):
        return [int(x) for x in num_str]


    def addToArrayForm(self, num: List[int], k: int) -> List[int]:
        total = int(self.arrToint(num)) + k
        return self.numTolist(str(total))


# Output:
# Input: num = [1,2,0,0], k = 34
# Output: [1,2,3,4]
# Explanation: 1200 + 34 = 1234

'''