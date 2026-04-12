#move zero at end
arr = [1,0,2,0,3,0,4,5]

arr2 = [0] * len(arr)
idx = 0
for i in range(len(arr)):
    if arr[i] != 0:
        arr2[idx] = arr[i]
        idx += 1

print(arr2)