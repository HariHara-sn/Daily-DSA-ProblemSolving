# find power of a number
def power(base, exponent):
    result = 1
    for _ in range(exponent):
        result = result * base
    return result

res = power(2, 0) # 2 ^ 0 is 1
print(res)