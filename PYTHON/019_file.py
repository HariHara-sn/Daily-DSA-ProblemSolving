from typing import List

def findRelativeRanks(score: List[int]) -> List[str]:
    indexed = [(s, i) for i, s in enumerate(score)]
    indexed.sort(reverse=True)
    print(indexed)
    
    result = [""] * len(score)
    medals = ["Gold Medal", "Silver Medal", "Bronze Medal"]
    
    for rank, (_, idx) in enumerate(indexed):   
        if rank < 3:
            result[idx] = medals[rank]
        else:
            result[idx] = str(rank + 1)
    
    return result

# Test
score = [10, 3, 8, 9, 4]
print(findRelativeRanks(score))
