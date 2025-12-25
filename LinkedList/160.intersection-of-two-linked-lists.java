/*
 * @lc app=leetcode id=160 lang=java
 *
 * [160] Intersection of Two Linked Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currentA = headA;
        ListNode currentB = headB;

       while (currentA!=currentB){
        if (currentA == null){
            currentA = headB;
        }
        if (currentB == null){
            currentB = headA;
        }
        if (currentA == currentB || (currentA == null && currentB==null)){
            break;
        }
        currentA = currentA.next;
        currentB = currentB.next;
       }
       return currentA;
    }
}
// @lc code=end

