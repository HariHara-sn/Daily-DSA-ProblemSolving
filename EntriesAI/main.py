matrix = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]
rows = len(matrix)
cols = len(matrix[0])
transpose = matrix
for r in range(rows):
    for c in range(cols):
        transpose[c][r] = matrix[r][c]
