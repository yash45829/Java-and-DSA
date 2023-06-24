// Ques 4: 💡 You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
// Increment the large integer by one and return the resulting array of digits.


class Solution {
    public int[] plusOne(int[] digits) {


         for( int j = digits.length -1 ; j >= 0 ; j-- ){
          digits[j] = digits[j] + 1 ;
          if(digits[j] != 10){
              return digits ;
              
          }else{
              digits[j] = 0;
          }
       }
        int newDigits[] = new int[digits.length+1];
        newDigits[0] = 1 ;
         
        
        return newDigits;
    }
}

/*Note: This is a leetcode solution that I have done and successfully submitted */