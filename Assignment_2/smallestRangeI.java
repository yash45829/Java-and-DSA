package Assignment_2;

import java.util.Arrays;

/*Ques 8 : You are given an integer array nums and an integer k.

In one operation, you can choose any index i where 0 <= i < nums.length and change nums[i] to nums[i] + x where x is an integer from the range [-k, k]. You can apply this operation at most once for each index i.

The score of nums is the difference between the maximum and minimum elements in nums.

Return the minimum score of nums after applying the mentioned operation at most once for each index in it */


class Solution {
    public int smallestRangeI(int[] nums, int k) {
        Arrays.sort(nums);
        int result = 0 ;
        // minimum max
        int max = nums[nums.length-1] - k;
        if((max-nums[0]) < k){
            result = 0;
        }else{
            result = max - nums[0] - k ;
        }
        return result ;
    }
}

/*Note: This is a leetcode solution that I have done and successfully submitted */