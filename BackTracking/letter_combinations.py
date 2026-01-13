#17. Letter Combinations of a Phone Number
def letterCombinations(digits):
    if not digits:
        return []

    phone = {
        "2": "abc",
        "3": "def",
        "4": "ghi",
        "5": "jkl",
        "6": "mno",
        "7": "pqrs",
        "8": "tuv",
        "9": "wxyz"
    }

    result = []
    def backtrack(idx, current):
        if idx == len(digits):
            result.append(current)
            return
        letter = phone[digits[idx]]
        
        for ch in letter:
            backtrack(idx + 1, current + ch)
    
    backtrack(0, "")
    return result
print(letterCombinations("23"))