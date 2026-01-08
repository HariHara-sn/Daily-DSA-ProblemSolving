# 520. Detect Capital
def isAllUpperCase(word):
    for i in word:
        if( not (i >= 'A' and i <= 'Z')):
            return False
    return True

def isAllLowerCase(word):
    for i in word:
        if( not (i >= 'a' and i <= 'z')):
            return False
    return True

s = "USA"

if(isAllUpperCase(s)):
    print(True)
elif(isAllLowerCase(s)):
    print(True)
elif(s[0] >= 'A' and s[0] <= 'Z'):
    if(isAllLowerCase(s[1:])):
        print(True)
    else:
        print(False)
