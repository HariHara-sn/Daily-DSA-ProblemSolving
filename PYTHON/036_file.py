#reverse for loop in ways
n = 10
lst = [9, 1]
for i in range(n, 0, -1):
    print(i)


for i in range(n + 1)[::-1]:
    print(i)

for i in reversed(range(n + 1)):
    print(i)

# In list
print("---------")
for i in range(len(lst)) :
    print(lst[i])
print("-----")
for i in range(len(lst))[::-1]:
    print(lst[i])