package Assignment_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Ques 6 : Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears **once** or **twice**, return *an array of all the integers that appears **twice***.
You must write an algorithm that runs in O(n) time and uses only constant extra space.*/



class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       
        Arrays.sort(nums);
       
        List<Integer> key = new ArrayList<Integer>();  
        int i  = 0 ;
        while(i<nums.length-1){
         if(nums[i] == nums[i+1]){
             key.add(nums[i]);
             i = i + 2 ;
         }else{
             i++;
         }
        }
     return key ;
    }
}


// Note : I have solved problem in java on leetcode platform and successfully submitted.
