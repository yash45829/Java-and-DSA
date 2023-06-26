package Assignment_2;

import java.util.Arrays;

/*Ques 5 : Given an integer array nums, find three numbers whose product is maximum and return the maximum product.*/


class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length ;
        int result = nums[n-1]*nums[n-2]*nums[n-3] ; 
        int start = nums[n-1]*nums[0]*nums[1];
        if(start > result ){
           result = start ;
        }
        return result ;
    }
}
/*Note: This is a leetcode solution that I have done and successfully submitted */

