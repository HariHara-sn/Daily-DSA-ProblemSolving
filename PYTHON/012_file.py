apple = [1,3,2]
capacity = [4,3,1,5,2]
appleSum = sum(apple)
capacity.sort(reverse=True)
for i in range(len(capacity)):
    if appleSum <= 0:
        print(i)
        break
    appleSum -= capacity[i]
print(len(capacity))