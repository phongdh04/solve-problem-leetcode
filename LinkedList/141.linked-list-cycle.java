/*
 * @lc app=leetcode id=141 lang=java
 *
 * [141] Linked List Cycle
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
class Solution141 {
    public boolean hasCycle(ListNode head) {
        if (head == null)   return false;
        ListNode fast = head;
        ListNode slow = head;
        while (slow != null && fast != null && fast.next != null ){
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast){
                return true;
            }
        }
        return false;
    }
}
// @lc code=end

