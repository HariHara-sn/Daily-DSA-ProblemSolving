a = [1, 2, 3]
b = ['A', 'B', 'C' , 'D']

small = min(len(a), len(b))
merged = []
for i in range(small):
    merged.append(a[i])
    merged.append(b[i])

maxi = max(len(a), len(b))

for i in range(small, maxi):
    if len(a) != small:
        merged.append(a[i])
    if len(b) != small:
        merged.append(b[i])
print(merged)