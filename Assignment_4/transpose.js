/*Ques 3 : Given a 2D integer array matrix, return *the **transpose** of* matrix.
The **transpose** of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.*/

/**
 * @param {number[][]} matrix
 * @return {number[][]}
 */

var transpose = function(matrix) {

  // column
    let n = matrix.length
    // row
    let m = matrix[0].length
    let result = [];
 
    console.log(result)
     for(let i=0; i< m; i++ ){
        let temp = []; // temp array
         for(let j=0; j< n; j++){
             temp.push(matrix[j][i])
         }
         result.push(temp);
     }
    return result ;
};

// Note : Done problem in js and successfully submit on leetcode .

