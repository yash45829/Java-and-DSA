
// Ques 5:You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
// Merge nums1 and nums2 into a single array sorted in non-decreasing order.

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
          int i = m-1;
          int j = n-1;
          int k = m+n-1;
          while(i>=0 && j>=0){
           if(nums1[i] >nums2[j]){
               nums1[k] = nums1[i];
               i--;
           }else{
               nums1[k] = nums2[j];
               j--;
           }
               k--;
          }
          if(i>=0){
              while(i>=0){
                  nums1[k] = nums1[i];
              }
          }else if(j>=0){
              while(j>=0){
                 nums1[k] = nums2[j];
              }
          }


    }
}

/*Note: This is a leetcode solution that I have done and successfully submitted */

