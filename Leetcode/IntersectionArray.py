# 349. Intersection of Two Arrays

nums1 = [1,2,2,1]
nums2 = [2,2]
# output : [2]

# nums1 = [4, 9, 5]
# nums2 = [9, 4, 9, 8, 4]
# output : [9, 4]
nums1 = set(nums1)
nums2 = set(nums2)
print(nums1, nums2)
res = []
for num in nums2:
    if num in nums1:
        res.append(num)
print(res)
