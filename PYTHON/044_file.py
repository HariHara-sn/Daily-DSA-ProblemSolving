# sum digits
input_string = "1hari23"
# output : 1 + 23 = 24
total = 0
cur = ""
for ch in input_string:
    if ch.isdigit():
        cur += ch
    elif cur != "":
        total +=  int(cur)
        cur = ""

if cur != "":
    total += int(cur)
print(total)