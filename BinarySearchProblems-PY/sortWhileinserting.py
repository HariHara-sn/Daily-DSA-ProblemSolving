def sortInOrderMethod_1(arr, value):
    low = 0
    high = len(arr)

    while low < high:
        mid = (low + high) // 2
        if arr[mid] < value:
            low = mid + 1
        else:
            high = mid

    arr.insert(low, value)
    return arr


def sortInOrderMethod_2(arr, num):  # simple method
    for i, v in enumerate(arr):
        if num < v:
            arr.insert(i, num)
            return arr
    arr.append(num)
    return arr


stringWord = "13254"
res = []

for ch in stringWord:
    res = sortInOrderMethod_1(res, int(ch))
print("sortInOrderMethod_1: ",res)
print("sortInOrderMethod_2: ",sortInOrderMethod_2([1,3],2))

