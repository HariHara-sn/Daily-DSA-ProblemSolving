# Find the Encrypted String 3210
s = "byd"
k = 4
d = k % len(s)
curr = s[:d]
rest = s[d:]
encryptedString = rest + curr
print(encryptedString)