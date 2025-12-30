# LongestCommonPrefix
def longest_common_prefix(arr):
    
    prefix = ""
    firstword = arr[0]
    for i in range(len(arr)):
        prefix = prefix + firstword[i]
        for word in arr:
            if not word.startswith(prefix) :
                return prefix[:-1]
    return prefix

# arr = ["dog","racecar","car"]
arr = ["flower", "flow", "flight"]
print(longest_common_prefix(arr))

