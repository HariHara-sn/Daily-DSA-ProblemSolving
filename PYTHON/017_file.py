#709. To Lower Case

s  = "Hello"
str = ""
for i in s:
    if i >= 'A' and i <= 'Z':
        str += chr(ord(i) + 32)
    else:
        str += i
print(str)