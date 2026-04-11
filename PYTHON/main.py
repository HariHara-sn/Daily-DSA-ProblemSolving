# Find Repeating Element in Array
arr = [1, 2, 3, 2, 4, 5, 1, 3, 3]
unique = []
repeated = []

for num in arr:
    if num not in unique:
        unique.append(num)
    else:
        if num not in repeated:
            repeated.append(num)

print(repeated)



# without using #if num not in repeated:
# output :  [2, 1, 3, 3]
# with using #if num not in repeated:   [2, 1, 3]