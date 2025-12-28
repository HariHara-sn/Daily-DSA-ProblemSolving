#BubbleSort
def fun(arr, target):
    for i in range(len(arr)):
        for j in range(i+1,len(arr)):
            if arr[i] + arr[j] == target:
                return [arr[i],arr[j]]

#Two sum
arr = [5,2,4,3,9]
target = 7
print(fun(arr,target))

