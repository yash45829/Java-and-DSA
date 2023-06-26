package Assignment_2;

/*Ques 6 : Given an array of integers nums which is sorted in ascending order, and an integer target,
write a function to search target in nums. If target exists, then return its index. Otherwise,
return -1.

You must write an algorithm with O(log n) runtime complexity.*/


class Solution {
    public int search(int[] nums, int target) {
        int mid = (nums.length - 1 )/2 ;
        int index = -1 ;
       
       one: if(target > nums[mid]){
            for(int i= (mid +1);i<nums.length;i++){
                if(target == nums[i]){
                   index = i ;
                   break one ;
                }
            }
           
        }else{
             for(int j= 0; j<=mid; j++){
                 if(target == nums[j]){
                   index = j ;
                   break;
                }
            }
            
        }
     return index ;
    }  
}

/*Note: This is a leetcode solution that I have done and successfully submitted */