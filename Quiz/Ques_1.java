//Ques 1 : Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
// Language : Java 
class Solution {
    public void moveZeroes(int[] nums) {
        int k = 0 ;
        for(int i = 0 ; i<nums.length; i++){
            if(nums[i] != 0){
                nums[k] = nums[i];
                k++;
            }
        }
        while(k<nums.length){
            nums[k] = 0;
            k++;
        }
    }
}

// Note : This is leetcode solution that I have solved and successfully submitted.
