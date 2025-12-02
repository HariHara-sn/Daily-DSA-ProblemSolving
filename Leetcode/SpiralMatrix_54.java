import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int srow = 0;
        int scol = 0;
        int erow = matrix.length - 1;
        int ecol = matrix[0].length - 1;
        int count = 0, len = matrix.length * matrix[0].length;
        while (count < len) {
            // top row (left to right)
            for (int i = scol; i <= ecol && count < len; i++, count++) {
                list.add(matrix[srow][i]);
            }
            srow++;
            // right col (top to bottom)
            for (int i = srow; i <= erow && count < len; i++, count++) {
                list.add(matrix[i][ecol]);
            }
            ecol--;
            // bottom row (right to left)
            for (int i = ecol; i >= scol && count < len; i--, count++) {
                list.add(matrix[erow][i]);
            }
            erow--;
            // do by you and check it
            for (int i = erow; i >= srow && count < len; i--, count++) {
                list.add(matrix[i][scol]);
            }
            scol++;

        }
        return list;
    }
}

public class SpiralMatrix_54 {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        Solution leetCode = new Solution();

        System.out.println(leetCode.spiralOrder(matrix));
    }
}