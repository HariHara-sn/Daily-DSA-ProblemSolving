# find the all posible subset
def subsets(nums):
    result = []
    current = []

    def backtrack(i):
        # If we've decided for all items, record the subset
        if i == len(nums):
            result.append(current.copy())
            return

        # Choice 1: include nums[i]
        current.append(nums[i])
        backtrack(i + 1)

        # Undo the choice (backtrack)
        current.pop()

        # Choice 2: exclude nums[i]
        backtrack(i + 1)

    backtrack(0) # this is initial fun call
    return result

print(subsets([1, 2, 3]))
