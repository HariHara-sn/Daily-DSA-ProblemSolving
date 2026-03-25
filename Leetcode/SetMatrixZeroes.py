from typing import List

class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        # Input
        for row in range(len(matrix)):
            for col in range(len(matrix[0])):
                print(matrix[row][col], end=" ")
            print("")
            
        # Find the Zeroth Index
        idx = []
        for row in range(len(matrix)):
            for col in range(len(matrix[0])):
                if matrix[row][col] == 0:
                    idx.append(col)
        # If the row contains Zero make them Zero
        for row in range(len(matrix)):
            if 0 in matrix[row]:
                matrix[row] = [0] * len(matrix[row])
        print(idx)

        for row in range(len(matrix)):
            for col in range(len(matrix[0])):
                if col in idx:
                    # print(col)
                    matrix[row][col] = 0
                                                        
        #Output
        for row in range(len(matrix)):
            for col in range(len(matrix[0])):
                print(matrix[row][col], end=" ")
            print("")