// Ques 1: Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

class Solution {
    public int[] twoSum(int[] nums, int target){
        // ans array contain required indices
      int ans[] = new int[2];
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = 0 ; j < nums.length ; j++){
                if(nums[i] + nums[j] == target){
                   ans[0] = j;
                   ans[1] = i;
                   break;
                }
            }
        }
  return ans ;
  }
}

/*Note: This is a leetcode solution that I have done and successfully submitted */