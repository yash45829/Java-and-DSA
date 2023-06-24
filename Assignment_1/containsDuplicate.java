
// Ques 6 : Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean result = false ;
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length -1 ; i++){
             if(nums[i] == nums[i+1]){
                   result = true ;
                   break;
                }
        }

        return result ;
    }
}

/*Note: This is a leetcode solution that I have done and successfully submitted */