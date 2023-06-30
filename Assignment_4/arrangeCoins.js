/*Ques 5 : You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase **may be** incomplete.
Given the integer n, return *the number of **complete rows** of the staircase you will build*.
*/

/**
 * @param {number} n
 * @return {number}
 */

var arrangeCoins = function(n) {
    let j =1;
    while(n >= j){
        n = n - j;
        j++;
    }
    return j-1 ;
};

// Note : Done problem in js and successfully submit on leetcode .
