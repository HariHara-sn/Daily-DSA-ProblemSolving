# vowel Consonant Compression

word = "yogurt"
#CVCVC
vowels = set("aeiou")
unique = []
for ch in word:
    if ch in vowels:
        unique.append("V")
    else:
        unique.append("C")

print(unique)
for i in range(len(unique)):
    if i + 1 < len(unique) and unique[i] != unique[i + 1]:
        print(unique[i], end=" ")
print(unique[-1])