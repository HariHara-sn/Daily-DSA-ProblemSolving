# Factorial Trailing Zeroes

def trailingZeroes(n):
    count = 0
    while n > 0:
        n = n // 5
        count += n
    return count

#main
n = 30
print(trailingZeroes(n))

# n = 5 
# output = 1
# fact = 1 * 2 * 3 * 4 * 5 = 120
# trailing zeroes = 1