# merge two list
nums1 = [1,2,3]
nums2 = [2,5,6]

merged = []
h1 = 0
h2 = 0
while h1 < len(nums1) and h2 < len(nums2):
    if nums1[h1] < nums2[h2]:
        merged.append(nums1[h1])
        h1 += 1
    else:
        merged.append(nums2[h2])
        h2 += 1
    print(merged)

while h1 < len(nums1):
    merged.append(nums1[h1])
    h1 += 1

while h2 < len(nums2):
    merged.append(nums2[h2])
    h2 += 1
print("final: ",merged)