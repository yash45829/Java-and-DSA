// Ques 2 :Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val. 

class Solution {
    public int removeElement(int[] nums, int val) {
          // Counter for elements not equal to val
        int count = 0;
        // traversing the nums array
        for (int i = 0; i < nums.length; i++) {
            // if element is not equal to val increasing count value
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        return count;
     
    }
}

/*Note: This is a leetcode solution that I have done and successfully submitted */