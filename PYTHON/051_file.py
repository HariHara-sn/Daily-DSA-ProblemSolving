input_digit = 10 
binary = format(input_digit, "b")
binary = str(binary)
print(binary)

res = "".join('1' if bit == '0' else '0' for bit in binary)

print(int(res, 2))