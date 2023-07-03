package Assignment_6;


/*Ques 3 : Given an array of integers arr, return true if and only if it is a valid mountain array. */


class Solution {
    public boolean validMountainArray(int[] arr) {
        int h = arr.length;
        boolean key = false;
        if (h >= 3) { // checking if array is of valid size
            if (arr[1] <= arr[0]) {

            } else {
                int counter = 0;
                for (int i = 0; i < h - 1; i++) {
                    if (arr[i + 1] > arr[i]) {
                        counter++; // if next element is bigger than than current element
                    } else {
                        break; // if next element is less than than current element
                    }
                }
                for (int i = counter; i < h - 1; i++) {
                    if (arr[i + 1] >= arr[i]) {
                        key = false;
                        break;
                    }
                    key = true;
                }

            }
        }
        return key;
    }
}
