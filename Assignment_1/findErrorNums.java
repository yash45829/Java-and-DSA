// Ques 8 : You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number. 
// You are given an integer array nums representing the data status of this set after the error.Find the number that occurs twice and the number that is missing and return them in the form of an array.


class Solution {
    public int[] findErrorNums(int[] nums) {
     
  // assume nums is non-empty
  int n = nums.length;
  int dup = -1, miss = -1;

  for (int i = 1; i <= n; ++i) { // for 1...n
    int count = 0;
    for (int val : nums) {
      if (val == i) {
        count += 1;
      }
    }
    if (count == 2) dup = i;
    if (count == 0) miss = i;
    // if both are set, then break
    if (dup > 0 && miss > 0) break;
  }

  return new int[] { dup, miss };

    }
}

/*Note: This is a leetcode solution that I have done and successfully submitted */