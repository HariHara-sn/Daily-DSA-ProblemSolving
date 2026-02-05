arr = [1, 2, 2, 3, 4, 4]
j = 0
for i in range(1, len(arr)):
    if arr[i] != arr[j]:
        j += 1
        arr[j] = arr[i]


for i in range(0, j + 1):
    print(arr[i], end = " ")