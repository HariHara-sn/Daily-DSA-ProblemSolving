# 5. Longest Palindromic Substring
def isPalindrome(s: str) -> bool:
    i = 0
    j = len(s) - 1
    while(i < j) :
        if s[i] != s[j]:
            return False
        i += 1
        j -= 1
    return True
def longestPalindrome(s: str) -> str:
    longestStr = ""
    for i in range(len(s)):
        for j in range(i+1, len(s) + 1):
            sub = s[i:j]
            if isPalindrome(sub) and len(sub) > len(longestStr) :
                longestStr = sub
    return longestStr

print(longestPalindrome("cbbdracecar"))