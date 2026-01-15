#next greater - Majority element

# arr = { 7, 24, 3, 1 }; // op : 24 -1 -1 -1
# arr = { 4, 5, 2, 25 }; // op : 5 25 25 -1

arr = [4, 5, 2, 25 ]
found = True
for i in range(len(arr)):
    for j in range(i + 1, len(arr)):
        if arr[i] < arr[j]:
            found = False
            print(arr[j], end=" ")
            break

    if found:
        print(-1, end=" ")
    found = True


