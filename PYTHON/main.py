#min and max in arr 
arr = [10, 5, 30, 2, 15]
maxima = -1
minima = 1000
for num in arr:
    if num > maxima:
        maxima = num
    if num < minima:
        minima = num
print(maxima, " ", minima)