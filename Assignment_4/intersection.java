package Assignment_4;

// ques 1 : Given three integer arrays arr1, arr2 and arr3 sorted in strictly increasing order, return a sorted array of only the integers that appeared in all three arrays.

import java.util.ArrayList;
public class intersection {


    public static void main(String[] args) {
        int[] arrOne = { 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, 18, 21, 22 }; // ex: array 1
        int[] arrTwo = { 1, 2, 5, 7, 9, 10, 11, 12, 13, 14 }; // ex: array 2
        int[] arrThree = { 1, 3, 4, 5, 8, 9, 10 }; // ex: array 3
        ArrayList<Integer> result = new ArrayList<Integer>(); //result
       
       
        for (int i = 0; i < arrOne.length; i++) { // iterating over array 1


            two: for (int j = 0; j < arrTwo.length; j++) { // checking element in array 2
                if (arrOne[i] < arrTwo[j]) {
                    // if element is less then present element of array 2 breaking the loop
                    break two;
                } else if (arrOne[i] == arrTwo[j]) {


                    for (int k = 0; k < arrThree.length; k++) {
                        // checking element in array 3 if it is present in array 2
                                                           
                        if (arrOne[i] < arrTwo[j]) {
                            break two;
                        } else if (arrOne[i] == arrThree[k]) {
                          result.add(arrOne[i]);
                           
                        }
                    }
                }
            }
        }
        // printing result
       System.out.println(result);
    }
}


// Note : Problem is not available on leetcode that's why solved in vs code ide .