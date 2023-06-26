package Assignment_2;

/* Ques 1 : Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2),..., (an, bn) such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.*/

import java.util.Arrays;

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0 ;
        for(int j = 0 ; j<nums.length ; j = j+2){
            sum = sum + nums[j];
        }
        return sum;
    }
}

/*Note: This is a leetcode solution that I have done and successfully submitted */
