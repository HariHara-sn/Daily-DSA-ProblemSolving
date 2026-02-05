# nums = [int(x) for x in input("Enter: ").split()]
nums = [30, 10, 50 , 20, 40]
firstMax = 0
secondMax = 0
idx = 0
for i in range(len(nums)):
    if nums[i] > firstMax:
        secondMax = firstMax
        firstMax = nums[i]
    elif nums[i] > secondMax and firstMax != secondMax:
        secondMax = nums[i]

print("first Max", firstMax)
print("second Max", secondMax)

# for find second max in one looop : always have 2nd max then firstmax - format