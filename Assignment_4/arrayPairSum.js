/* Ques 4 : Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn) such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.*/

/**
 * @param {number[]} nums
 * @return {number}
 */

var arrayPairSum = function (nums) {
  let sum = 0;

  function compareNumbers(a, b) {
    return a - b;
  }
//   sort number array 
  nums.sort(compareNumbers);

  for (let i = 0; i < nums.length; i = i + 2) {
    sum = sum + nums[i];
  }
  return sum;
};

// Note : Done problem in js and successfully submit on leetcode .
