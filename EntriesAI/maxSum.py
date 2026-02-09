arr = [   4]
print(sum(arr))
currSum = 0
maxSum = arr[0]
for i in range(len(arr)):
    currSum = max(arr[i], arr[i] + currSum)
    maxSum = max(maxSum, currSum)
print(maxSum) 