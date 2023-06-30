package Assignment_3;

/*Ques 7 : You are given an inclusive range [lower, upper] and a sorted unique integer array
nums.
A number x is considered missing if x is in the range [lower, upper] and x is not in
nums.
Return the shortest sorted list of ranges that exactly covers all the missing
numbers. */

class Solution {
    public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
 
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length==0){
            res.add(List.of(lower, upper));
            return res;
        }
        if(lower < nums[0]){
            res.add(List.of(lower, nums[0]-1));
        }
 
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1!=nums[i+1]){
                res.add(List.of(nums[i]+1, nums[i+1]-1));
            }
        }
        if(nums[nums.length-1] < upper){
            res.add(List.of(nums[nums.length-1]+1, upper));
        }
 
        return res;
    }
}
