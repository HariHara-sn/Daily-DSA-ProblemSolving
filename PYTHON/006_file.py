#SumofUniqueElements_1748
arr = [1,2,3,2]
freq = [0]*101
sum = 0
for i in arr:
    freq[i] += 1

for i in range(len(freq)):
    if freq[i] == 1:
        sum += i
print(sum)