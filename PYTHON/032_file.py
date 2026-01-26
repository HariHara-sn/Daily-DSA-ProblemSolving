#continuous sub arr sum

arr = [1, 2, 3]
total = 0
for i in range(len(arr)):
    for j in range(i + 1, len(arr) + 1):
        total += sum(arr[i : j])
print(total)