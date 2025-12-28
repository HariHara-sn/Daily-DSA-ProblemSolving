#Remove Duplicates
arr = [10, 20, 30, 40, 40, 50]
j = 0  #filter
for i in range(1,len(arr)):
    while(arr[j] != arr[i]):
        j = j + 1
        arr[j] = arr[i]
    
for i in range(0,j):
    print(arr[i],end=" ")
        