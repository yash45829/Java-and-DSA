package Assignment_6;

/*Ques 1 : A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:
- s[i] == 'I' if perm[i] < perm[i + 1], and
- s[i] == 'D' if perm[i] > perm[i + 1].
Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return **any of them**.*/


class Solution {
    public int[] diStringMatch(String s) {

       int  l = s.length();
       int[] key = new int[l+1];
       int start = 0 ;
       int end = l ;
         for(int k=0; k < l ; k++){
            if(s.charAt(k) == 'I'){
                key[k] = start ;
                start++;
            }else{
                key[k] = end ;
                end--;
            }
         }
         key[l] = start;

      return key ;
    }
}
// leetcode Solution

