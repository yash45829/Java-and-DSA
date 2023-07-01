package Assignment_5;

/*Ques 5 : Given two integer arrays arr1 and arr2, and the integer d, *return the distance value between the two arrays*.
The distance value is defined as the number of elements arr1[i] such that there is not any element arr2[j] where |arr1[i]-arr2[j]| <= d.*/


class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        
        int key = 0 ;
        for(int r=0; r<arr1.length; r++){
            boolean valid = true ;
          two :  for(int s=0; s<arr2.length; s++){
              
               if(Math.abs(arr1[r] - arr2[s]) <= d){
                   valid = false ;
                   break two ;
               }
            }
            if(valid == true)
                key++;
            
        }
      return key ;
    }
}

// Note : I have solved problem in java on leetcode platform and successfully submitted.

