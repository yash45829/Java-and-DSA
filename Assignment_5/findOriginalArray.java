package Assignment_5;

/*Ques 8 : An integer array original is transformed into a **doubled** array changed by appending **twice the value** of every element in original, and then randomly **shuffling** the resulting array.
Given an array changed, return original *if* changed *is a **doubled** array. If* changed *is not a **doubled** array, return an empty array. The elements in* original *may be returned in **any** order*.*/


class Solution {
    public int[] findOriginalArray(int[] changed) {

    List<Integer> ans = new ArrayList<>();
    Queue<Integer> q = new ArrayDeque<>();

    Arrays.sort(changed);
    for (final int num : changed)
      if (!q.isEmpty() && num == q.peek()) {
        q.poll();
      } else {
        q.offer(num * 2);
        ans.add(num);
      }
      
    return q.isEmpty() ? ans.stream().mapToInt(Integer::intValue).toArray() : new int[] {};
    
    }
}
