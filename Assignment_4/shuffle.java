package Assignment_4;

/*Ques 8 : Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form* [x1,y1,x2,y2,...,xn,yn]. */

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];
        int a = 0 ;
        int b = n;
      
        for(int s=0 ; s< 2 * n ; s++){
            if((s%2) == 0){
                result[s] = nums[a];
                a++;
            }else{
                result[s] = nums[b];
                b++;
            }
        }
        return result ;
    }
}

// Note : I have solved problem in java on leetcode platform and successfully submitted.
