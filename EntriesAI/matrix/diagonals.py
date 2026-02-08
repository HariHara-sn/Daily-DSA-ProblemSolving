matrix = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

for i in range(len(matrix)):
    print(matrix[i][i])
#output : 1 5 9

n =  len(matrix)
for i in range(len(matrix)):
    print(matrix[i][n - i - 1])
#output : 3 5 7