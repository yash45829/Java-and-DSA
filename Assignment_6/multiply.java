package Assignment_6;

/* Ques 8 : Given two sparse matrices mat1 of size m x k and mat2 of size k x n, return the result of mat1 x mat2. You may assume that multiplication is always possible. */

class Solution {

    public int[][] multiply(int[][] A, int[][] B) {

        // creating result matrix
        int[][] C = new int[A.length][B[0].length];

        for (int i = 0; i < C.length; i++) {
            for (int k = 0; k < A[0].length; k++) {
                if (A[i][k] != 0) {
                    for (int j = 0; j < C[0].length; j++) {
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
        }

        return C;
    }
}
