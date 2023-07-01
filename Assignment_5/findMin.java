package Assignment_5;

/*Ques 7 : Suppose an array of length n sorted in ascending order is rotated between 1 and n times
Given the sorted rotated array nums of **unique** elements, return *the minimum element of this array*.
You must write an algorithm that runs in O(log n) time.*/


class Solution {
    public int findMin(int[] nums) {
        int value = nums[0] ;
        for(int r=0; r <= (nums.length/2) ; r++){
            if(nums[r] > nums[nums.length - r -1]){
                if(nums[nums.length -r -1] < value){
                    value = nums[nums.length -r -1];
                }
            }else{
                if(nums[r] < value){
                    value = nums[r];
                }
            }
        }
        return value ;
    }
}

