package Assignment_6;

/* Ques 7 :Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.*/

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];

        int k = 1;
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        while (k <= n * n) {
            for (int i = left; i <= right; i++) {
                result[top][i] = k;
                k++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                result[i][right] = k;
                k++;
            }
            right--;

            for (int i = right; i >= left; i--) {
                result[bottom][i] = k;
                k++;
            }
            bottom--;

            for (int i = bottom; i >= top; i--) {
                result[i][left] = k;
                k++;
            }
            left++;
        }

        return result;

    }
}
