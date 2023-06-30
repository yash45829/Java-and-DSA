package Assignment_3;

/*Ques 4 :Given a sorted array of distinct integers and a target value, return the index if the
target is found. If not, return the index where it would be if it were inserted in
order.

You must write an algorithm with O(log n) runtime complexity.*/

class Solution {
    public int searchInsert(int[] nums, int target) {
        int mid = (nums.length - 1 )/2 ;
        int result = 0;
       
       one: if(target > nums[mid]){
            for(int i= (mid +1);i<nums.length;i++){
                if(target <= nums[i]){
                   result = i ;
                   break one ;
                }
            }
            result = nums.length;
        }else{
             for(int j= 0; j<=mid; j++){
                 if(target <= nums[j]){
                   result = j ;
                   break;
                }
            }
        }
        return result ;
    }
}
/*Note: This is a leetcode solution that I have done and successfully submitted */


