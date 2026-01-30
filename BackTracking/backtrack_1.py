# find the all posible subset
def subsets(nums):
    result = []
    current = []

    def backtrack(i):
        # If we've decided for all items, record the subset
        if i == len(nums):
            result.append(current.copy())
            print("result: ",result)
            return

        # Choice 1: include nums[i]
        current.append(nums[i])
        print("curr append:", current)
        backtrack(i + 1)
        print("curr before pop:", current)
        # Undo the choice (backtrack)
        current.pop()

        # Choice 2: exclude nums[i]
        backtrack(i + 1)

    backtrack(0) # this is initial fun call
    return result

print(subsets([1, 2, 3]))
