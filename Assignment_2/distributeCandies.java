package Assignment_2;

import java.util.Arrays;

/* Ques 2 :Alice has n candies, where the ith candy is of type candyType[i]. Alice noticed that she started to gain weight, so she visited a doctor. 

The doctor advised Alice to only eat n / 2 of the candies she has (n is always even). Alice likes her candies very much, and she wants to eat the maximum number of different types of candies while still following the doctor's advice. 

Given the integer array candyType of length n, return the maximum number of different types of candies she can eat if she only eats n / 2 of them. */

class Solution {
    public int distributeCandies(int[] candyType) {
        int count = 0 ;
        int value = -1 ;
        Arrays.sort(candyType);
        int n = candyType.length ; 
        for(int j=0; j < n ; j++ ){
            if( (count != (n/2)) && (candyType[j] != value) ){
                count++;
                value = candyType[j];
            }
        }
        return count;
    }
}

/*Note: This is a leetcode solution that I have done and successfully submitted */
