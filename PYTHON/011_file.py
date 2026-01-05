def strToint(s):
    res = 0
    for i in range(len(s)):
        res = res * 10 + ord(s[i]) - ord('0')
    return res
def intTostr(num):
    if num == 0:
        return "0"
    res = ""
    while num > 0:
        res = f"{num % 10}" + res
        num //= 10
    return res

s = "12345"
res = strToint(s)

print("StrToInteger: ",res)
print("IntToString: ",intTostr(res))

""" 
ways to convert int to string
  I/P:  n = 42
    ---------
    s = f"{n}"
    ---------
    s = str(n)
    ----------
    s = chr(n % 10 + ord('0)) -> convert ascii value to char

"""