#Delete Columns to Make Sorted
strs = ["zyx","wvu","tsr"]
row = len(strs)
col = len(strs[0])
delCount = 0
for cl in range(0, col):
    for rw in range(1, row):
        if strs[rw - 1][cl] > strs[rw][cl]:
            delCount += 1
            break

print(delCount)




"""
Input: strs = ["cba","daf","ghi"]
Output: 1

Input: strs = ["zyx","wvu","tsr"]
Output: 3
"""