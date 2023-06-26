package Assignment_2;


/*Ques 4 : You have a long flowerbed in which some of the plots are planted, and some are not.
However, flowers cannot be planted in adjacent plots.
Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.*/


class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean result = false;
        int countZero = 1 ;
        int count = 0 ;
        for(int k = 0 ; k < flowerbed.length -1 ; k++){
            if(flowerbed[k] != 1){
                countZero++;
                if(countZero == 3){
                    countZero =1 ;
                    count++;
                }
            }else{
                countZero = 0;


            }
           
        }
        if((countZero >= 1) && (flowerbed[flowerbed.length-1] == 0 )){
            count++;
        }
        if(count >= n){
            result = true;
        }
        return result;
    }
}
/*Note: This is a leetcode solution that I have done and successfully submitted */

