# Complement of Base10 Integer
n = 5
print("Integer : ", n )
# Integer to binary
binary_string = format(n, 'b')
print("Integer to Binary : ", binary_string)
complemented_binary = ''.join(['1' if bit == '0' else '0' for bit in binary_string])

print("Complemented Binary : ", complemented_binary)
# Binary to Integer
print("Integer to Binary : ", int(complemented_binary, 2))