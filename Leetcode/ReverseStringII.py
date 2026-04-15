# Given a string s and an integer k, reverse the first k characters for every 2k block of the string.
# Rules:
'''
For every chunk of 2k characters:
Reverse the first k
Leave the next k as-is
If fewer than k characters remain → reverse all
If between k and 2k → reverse only first k
Example:
s = "abcdefg", k = 2

Steps:

"ab" → reverse → "ba"
"cd" → keep
"ef" → reverse → "fe"
"g" → reverse (since < k)
'''

s = "abcdefgh"
#op : bacdfegh

k = 2
count = 1
should_reverse  = True
res = []
final = []
def rev(res):
    for i in range(len(res))[::-1]:
        final.append(res[i])

def fun(res, bol):
    if bol:
        rev(res)    
        bol = False
    else:
        for i in range(len(res)):
            final.append(res[i])
        bol = True
    return bol

for i in range(len(s)):
    res.append(s[i])
    if len(res) == k:
        should_reverse =  fun(res, should_reverse)
        res.clear()
# append the remaining characters
if res:
    if should_reverse:
        rev(res)
    else:
        final.extend(res)

print(" ".join(final))