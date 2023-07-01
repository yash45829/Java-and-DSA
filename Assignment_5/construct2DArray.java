package Assignment_5;

/*Ques 1 : Convert 1D Array Into 2D Array
You are given a **0-indexed** 1-dimensional (1D) integer array original, and two integers, m and n. You are tasked with creating a 2-dimensional (2D) array with  m rows and n columns using **all** the elements from original.
The elements from indices 0 to n - 1 (**inclusive**) of original should form the first row of the constructed 2D array, the elements from indices n to 2 * n - 1 (**inclusive**) should form the second row of the constructed 2D array, and so on.
 array constructed according to the above procedure, or an empty 2D array if it is impossible*.*/


 class Solution {
  public int[][] construct2DArray(int[] original, int m, int n) {
    if (original.length != m * n)
      return new int[][] {};

    int[][] ans = new int[m][n];

    for (int i = 0; i < original.length; ++i)
      ans[i / n][i % n] = original[i];

    return ans;
  }
}

// Note : I have solved problem in java on leetcode platform and successfully submitted.
