package Assignment_4;

/*Ques 7 : You are given an m x n matrix M initialized with all 0's and an array of operations ops, where ops[i] = [ai, bi] means M[x][y] should be incremented by one for all 0 <= x < ai and 0 <= y < bi.
Count and return *the number of maximum integers in the matrix after performing all the operations*/

class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int result = 0 ;
        int l = ops.length;
        if(l == 0){
            result = m * n ;
        }else{
        int minRow = ops[0][0] ;
        int minColumn = ops[0][1] ;
        for(int s=0; s< l ; s++){
            if(ops[s][0] < minRow){
                minRow = ops[s][0] ;
            }else{};
            if(ops[s][1] < minColumn){
                minColumn = ops[s][1] ;
            }
        }    
      result = minRow * minColumn ;
        }
      return result ;
    }
}

// Note : I have solved problem in java on leetcode platform and successfully submitted.
