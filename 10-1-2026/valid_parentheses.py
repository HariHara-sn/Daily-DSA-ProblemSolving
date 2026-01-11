class Solution:
    def isStarting(self, ch) -> bool:
        return ch == '(' or ch == '[' or ch == '{'
    def isValidParentheses(self, stack, idx : int, ch) -> bool:
        if stack[idx] == '(' and ch == ')':
            return True
        elif stack[idx] == '[' and ch == ']': 
            return True
        elif stack[idx] == '{' and ch == '}':
            return True
        return False

    def isValid(self, s: str) -> bool:
        stack = [''] * len(s)
        idx = -1
        for i in range(len(s)):
            ch = s[i]
            if self.isStarting(ch):
                idx += 1
                stack[idx] = ch
            elif idx >= 0 and self.isValidParentheses(stack, idx, ch):
                idx -= 1
            else:
                return False
        return idx == -1
        