matrix = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]
rows = len(matrix)
cols = len(matrix[0])
transpose = matrix
primary = []
for i in range(len(matrix)):
    primary.append(matrix[i][i])

print("Primary diagonal:", primary)
