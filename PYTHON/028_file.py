# Happy Number
def sumOfdigit(n : int) -> int:
    sum = 0
    while(n > 0):
        digit = n % 10
        sum = sum + (digit ** 2)
        n = n // 10
    return sum
n = 19
seen = set()
while n != 1 and n not in seen:
    seen.add(n)
    n = sumOfdigit(n)
    
print(n == 1)

