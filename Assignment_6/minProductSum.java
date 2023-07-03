package Assignment_6;

/*Ques 5 :Given two arrays nums1 and nums2 of length n, return the minimum product sum if you are allowed to rearrange the order of the elements in nums1*/

class Solution {
    public int minProductSum(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n = nums1.length, res = 0;
        for (int i = 0; i < n; ++i) {
            res += nums1[i] * nums2[n - i - 1];
        }
        return res;
    }
}
