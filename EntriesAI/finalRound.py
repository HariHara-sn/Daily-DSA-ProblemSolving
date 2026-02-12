# INPUT : order = [1, 2, 3, 1, 2, 1, 2, 3] max_e = 2
# OUTPUT :  [1, 2, 3, 1, 2, 3]
# link - https://www.codewars.com/kata/554ca54ffa7d91b236000023/train/python
order = [1, 2, 3, 1, 2, 1, 2, 3]
max_e = 2

freq = {}
res = []
for i in order:
    if i not in freq:
        freq[i] = 1
        res.append(i)
    elif freq[i] < max_e:
        res.append(i)
        freq[i] += 1
print(freq)
print(res)