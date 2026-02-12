#binary search


def binarySearch(arr, target):
    low = 0
    high = len(arr) - 1
    while low < high:
        mid = (low + high) // 2
        if arr[mid] == target:
            return "found"
        elif arr[mid] < target:
            low = mid + 1
        else:
            high = mid - 1
    return "not found"



res = binarySearch(arr = [1,2,3,4,5], target = 4)
print(res)
