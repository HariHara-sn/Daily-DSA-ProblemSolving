# LongestCommonPrefix
# def longest_common_prefix(arr):
    
#     prefix = ""
#     firstword = arr[0]
#     for i in range(len(arr)):
#         prefix = prefix + firstword[i]
#         for word in arr:
#             if not word.startswith(prefix) :
#                 return prefix[:-1]
#     return prefix

def longest_common_prefix(arr):
    arr = ["flower", "flow", "flight"]

    prefix = ""
    firstword = arr[0]
    for i in range(len(arr)):
        prefix = prefix + firstword[i]
        for word in arr:
            print(word)
            if not word.startswith(prefix):
                return prefix



# arr = ["dog","racecar","car"]
arr = ["flower", "flow", "flight"]
print(longest_common_prefix(arr))