s = "()[]{}"

stack = []
for ch in s:
    if ch == '(':
        stack.append(')')
    elif ch == '[':
        stack.append(']')
    elif ch == '{':
        stack.append('}')
    else:
        if (len(stack) == 0) or stack.pop() != ch:
            break
print(len(stack) == 0)