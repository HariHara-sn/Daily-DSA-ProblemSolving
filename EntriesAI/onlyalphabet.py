word = "!^$H@a-r*8i"
result = ""
for i in word:
    if (ord(i) >= ord('a') and ord(i) <= ord('z')) or (ord(i) >= ord('A') and ord(i) <= ord('Z') ):
        result += i
print(result)
#output : Hari