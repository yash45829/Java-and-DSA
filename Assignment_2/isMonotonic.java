package Assignment_2;

/*Ques 7 : An array is monotonic if it is either monotone increasing or monotone decreasing.

An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is
monotone decreasing if for all i <= j, nums[i] >= nums[j].

Given an integer array nums, return true if the given array is monotonic, or false otherwise.*/


class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean ans = true ;
         if(nums[0] == nums[nums.length-1]){
             for(int k = 0 ; k < nums.length -1 ; k++){
                 if(nums[k] != nums[k+1]){
                     ans = false ;
                 }
             }
         
       } else if(nums[0] < nums[nums.length-1]){
             for(int k = 0; k < nums.length -1 ; k++){
                 if(nums[k] <= nums[k+1]){
                     
                 }else{
                     ans = false ;
                     break;
                 }
             }
        }else{
             for(int k = 0; k < nums.length -1 ; k++){
                 if(nums[k] >= nums[k+1]){
                     
                 }else{
                     ans = false ;
                     break;
                 }
             }
        }
        return ans ;
    }
}

/*Note: This is a leetcode solution that I have done and successfully submitted */