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