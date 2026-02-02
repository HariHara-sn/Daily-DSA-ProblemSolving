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
