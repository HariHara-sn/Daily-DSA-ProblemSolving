#visit for problem - https://www.codewars.com/kata/581214d54624a8232100005f/train/python
'''
Docstring for EntriesAI.matrix.diagonal_manipulate
Input array

[
  [-1,  4, -5, -9,  3 ],
  [ 6, -4, -7,  4, -5 ],
  [ 3,  5,  0, -9, -1 ],
  [ 1,  5, -7, -8, -9 ],
  [-3,  2,  1, -5,  6 ]
]

Output array

[
  [ 0,  4, -5, -9,  3 ],
  [ 6,  0, -7,  4, -5 ],
  [ 3,  5,  1, -9, -1 ],
  [ 1,  5, -7,  0, -9 ],
  [-3,  2,  1, -5,  1 ]
]
Function receive a two-dimensional square array of random integers. 
On the main diagonal, all the negative integers must be changed to 0, 
while the others must be changed to 1 (Note: 0 is considered non-negative, here).
'''
def matrix(array): 
    arr = array
    for i in range(len(arr)):
        if arr[i][i] < 0:
            arr[i][i] = 0
        elif arr[i][i] >= 0:
            arr[i][i] = 1
    return arr
arr = [
  [-1,  4, -5, -9,  3 ],
  [ 6, -4, -7,  4, -5 ],
  [ 3,  5,  0, -9, -1 ],
  [ 1,  5, -7, -8, -9 ],
  [-3,  2,  1, -5,  6 ]
]
print(matrix(arr))