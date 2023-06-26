package Assignment_2;

import java.util.Arrays;

/*Ques 3 : We define a harmonious array as an array where the difference between its maximum value
and its minimum value is exactly 1
Given an integer array nums, return the length of its longest harmonious subsequence
among all its possible subsequences. */


class Solution {
    public int findLHS(int[] nums) {
       Arrays.sort(nums);


        int left =0, right =1;
        int result = 0; 
        while(right < nums.length){
            int diff = nums[right] - nums[left];
            if(diff == 1){
                result = Math.max(result, right - left + 1);
            }
            // 2 2 3 
            if(diff <= 1){
                right++;
            }
            else {
                left++;
            }
        }
        return result;
    }
}
/*Note: This is a leetcode solution that I have done and successfully submitted */


