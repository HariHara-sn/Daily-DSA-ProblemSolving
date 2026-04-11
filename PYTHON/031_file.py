# Merge Sorted Array
def merge_sorted_arrays(arr1, arr2):
    m = len(arr1)
    n = len(arr2)
    h1 = h2 = 0

    arr_w = [0] * (m + n)
    idx = 0
    while(h1 < m and h2 < n):
        if arr1[h1] < arr2[h2]:
            arr_w[idx] = arr1[h1]
            h1 += 1
            idx += 1
        else:
            arr_w[idx] = arr2[h2]
            h2 += 1
            idx += 1
    
    while(h1 < m):
        arr_w[idx] = arr1[h1]
        idx += 1
        h1 += 1

    while(h2 < n):
        arr_w[idx] = arr2[h2]
        idx += 1
        h2 += 1


    print(arr_w)


nums1 = [1,2,3]
nums2 = [2,5,6]
merge_sorted_arrays(nums1, nums2)


#V1 leetcode
class Solution:
    def removeZero(self, arr):
        merged = []
        for num in arr:
            if num != 0:
                merged.append(num)
        print(merged)
        return merged
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:

        merged = []
        h1 = 0
        h2 = 0
        while h1 < m and h2 < n:
            if nums1[h1] < nums2[h2]:
                merged.append(nums1[h1])
                h1 += 1
            else:
                merged.append(nums2[h2])
                h2 += 1

        while h1 < m:
            merged.append(nums1[h1])
            h1 += 1

        while h2 < n:
            merged.append(nums2[h2])
            h2 += 1
        for i in range(len(merged)):
            nums1[i] = merged[i]


# merge two sorted array [ArrayList] V@
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