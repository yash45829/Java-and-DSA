package Assignment_6;

/*Ques 2 : You are given an m x n integer matrix matrix with the following two properties:
- Each row is sorted in non-decreasing order.
- The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true *if* target *is in* matrix *or* false *otherwise*.
You must write a solution in O(log(m * n)) time complexity */

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean key = false;
        int r = matrix.length;
        int c = matrix[0].length;

        if (target < matrix[r / 2][0]) { // checking if target lies before mid row.
            one: for (int i = 0; i < r / 2; i++) {
                if (target <= matrix[i][c - 1]) { // checking if taget lies in that row
                    if (target < matrix[i][c / 2]) { // checking if target lies before mid col.
                        for (int k = 0; k < (c / 2); k++) {
                            if (target == matrix[i][k]) {
                                key = true;
                                break one;
                            }
                        }
                    } else {
                        for (int k = c / 2; k < c; k++) {
                            if (target == matrix[i][k]) {
                                key = true;
                                break one;
                            }
                        }
                    }
                }
            }
        } else {
            two: for (int i = r / 2; i < r; i++) {
                if (target <= matrix[i][c - 1]) {
                    if (target < matrix[i][c / 2]) {
                        for (int k = 0; k < c / 2; k++) {
                            if (target == matrix[i][k]) {
                                key = true;
                                break two;
                            }
                        }
                    } else {
                        for (int k = c / 2; k < c; k++) {
                            if (target == matrix[i][k]) {
                                key = true;
                                break two;
                            }
                        }
                    }
                }
            }
        }

        return key;
    }
}
