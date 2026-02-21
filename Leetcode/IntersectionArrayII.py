# now i just cpy pasted
nums1 = [1,2,2,1]
nums2 = [2,2]

res = []
count = {}

# count frequency of nums1
for num in nums1:
    count[num] = count.get(num, 0) + 1

# check nums2 and reduce count
for num in nums2:
    if num in count and count[num] > 0:
        res.append(num)
        count[num] -= 1

print(res)   # [2, 2]