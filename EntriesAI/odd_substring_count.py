# total odd substring count
word = "1341"
count = 0
for i,ch in enumerate(word):
    if int(ch) % 2 != 0:
        count += i + 1

print(count)
        
'''
explain:
[here we only check last digit is odd.]

1 - count = 1
1 3 - count = 2(count) + 1(prev) => 3
1 3 4 - skip
1 3 4 1 - count = 4(count) + 3(prev) => 7
'''