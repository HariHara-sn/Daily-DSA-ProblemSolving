# 3Sum
# In python You can use list into set, only tuples are allowed in set

# nums = [-1,0,1,2,-1,-4]
nums = [1, -1, -1, 0, 2]

nums.sort()
seen = set()
n = len(nums)

for i in range(n-2):
    low = i + 1
    high = n - 1

    while low < high:
        s = nums[i] + nums[low] + nums[high]

        if s == 0:
            seen.add((nums[i], nums[low], nums[high]))
            low += 1
            high -= 1

        elif s < 0:
            low += 1
        else:
            high -= 1

n_list =  [list(t) for t in seen]
print(n_list)

    

