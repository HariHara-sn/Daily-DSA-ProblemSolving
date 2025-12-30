#second largest
arr = [int(x) for x in input("Enter: ").split()]
max = 0
smax = 0
for i in arr:
    if i > max:
        max = i
for i in arr:
    if i > smax and i != max:
        smax = i
print(smax)