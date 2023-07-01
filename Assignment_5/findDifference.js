/*Ques 2 : Given two **0-indexed** integer arrays nums1 and nums2, return *a list* answer *of size* 2 *where:*
- answer[0] *is a list of all **distinct** integers in* nums1 *which are **not** present in* nums2*.*
- answer[1] *is a list of all **distinct** integers in* nums2 *which are **not** present in* nums1.*/

/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[][]}
 */

 var findDifference = function(nums1, nums2) {

let set1 = new Set();
let set2 = new Set();
// declaring result[0]and result[1]
let arr1 = [] ;
let arr2 = [] ;

// converting nums1 and nums2 into set so that they contain element only once;
 nums1.map(arrayelements => set1.add(arrayelements));      
 nums2.map(arrayelements => set2.add(arrayelements));   

 let index2 = 0 ;
 set1.forEach((value)=>{
    if(!(set2.has(value))){
        arr1[index2++] = value ;    
    }
 })   

 let index1 = 0 ;
 set2.forEach((value)=>{
    if(!(set1.has(value))){
        arr2[index1++] = value ;
      
    }
 })   

 
 let result = [arr1,arr2]

    return result ;
};

// Note : Done problem in js and successfully submit on leetcode .