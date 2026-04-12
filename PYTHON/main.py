#move zero at end
arr = [1,0,2,0,3,0,4,5]

idx = 0
for i in range(len(arr)):
    if arr[i] != 0:
        arr[idx] = arr[i]
        idx += 1
while idx < len(arr):
    arr[idx] = 0
    idx += 1
print(arr)