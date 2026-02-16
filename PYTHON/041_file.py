#string compression
input_string = "aaabbc"
dict = {}

for i in input_string:
    dict[i] = dict.get(i, 0) + 1

res = ""

for k,v in dict.items():
    res = res + (k+str(v))

print(res)  #output :  a3b2c1