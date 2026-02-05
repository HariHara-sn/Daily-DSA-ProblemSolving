# A prime number is a whole number greater than 1 that can be divided only by 1 and itself — no other number fits evenly into it.

# Here’s the simple way to think about it:

#  Prime = only two factors: 1 and itself
#  Not prime (composite) = more than two factors

# ### Examples

#  2 → prime (only 1 and 2 divide it)
#  3 → prime
#  4 → not prime (1, 2, and 4 divide it)
#  5 → prime
#  6 → not prime (1, 2, 3, 6)

# ### A quick memory tip

# If a number can be arranged as a perfect rectangle (like 4 = 2×2 or 6 = 2×3), it’s not prime. If it can’t, it’s probably prime.

# If you want, I can explain how to check if a big number is prime too!

#check prime
def is_prime(num):
    if num == 0 or num == 1:
        return False
    for i in range(2, num // 2 + 1):
        if num % i == 0:
            return False
    return True
    

print("Prime" if is_prime(5) else "Not Prime")
print(5 // 2 + 1)