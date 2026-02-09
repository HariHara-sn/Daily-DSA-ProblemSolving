#method - 1
arr = [1, 2, 4, 5]
arr.append(0) # always add zero at  bcoz the arr start with 1

n = len(arr)
s = (n * ( n + 1 ) ) // 2
print(s - sum(arr))

#method - 2
# if arr doesnt contain 0
arr = [1, 2, 4, 5]
n = len(arr) + 1 # allways add +1 if you want to find missing num

expected_sum = n * (n + 1) // 2
actual_sum = sum(arr)

print(expected_sum - actual_sum)
