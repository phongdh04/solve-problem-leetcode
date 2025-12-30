    /*
    * @lc app=leetcode id=496 lang=java
    *
    * [496] Next Greater Element I
    */


    // @lc code=start

    import java.util.Hashtable;
    import java.util.Stack;

    class Solution {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            Hashtable <Integer, Integer> hashtable = new Hashtable<>();
            Stack<Integer> stack = new Stack<>();
            int []result = new int[nums1.length];
            for (int num : nums2){
                while (!stack.isEmpty() && stack.peek()<num){
                    hashtable.put(stack.pop(), num);
                }
                stack.push(num);
            }
            for (int i=0; i<nums1.length; i++){
                result[i] = hashtable.getOrDefault(nums1[i], -1);
            }
            return result;
        }
    }
    // @lc code=end

