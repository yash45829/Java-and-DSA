// Ques 7 :Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the nonzero elements
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


/*Note: This is a leetcode solution that I have done and successfully submitted */