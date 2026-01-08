# 459. Repeated Substring Pattern
'''
Example 1:
Input: s = "abab"
Output: true
Explanation: It is the substring "ab" twice.

Example 2:
Input: s = "aba"
Output: false
'''
s = "abab"
ss = s + s
sub = ss[1 : -1]

print(s in sub) # or print(True if s in sub else False) or print(True) if s in sub else print(False)





