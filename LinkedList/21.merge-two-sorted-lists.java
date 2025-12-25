/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode currentResult = new ListNode (1);
        ListNode headResult = currentResult;
        ListNode current1 = list1;
        ListNode current2 = list2;
        while (current1 != null && current2 != null){
            if (current1.val <= current2.val){
                currentResult.next = current1;
                current1 = current1.next;
            }
            else{
                currentResult.next = current2;
                current2 = current2.next;
            }
            currentResult = currentResult.next;
        }
        while (current1 != null){
            currentResult.next = current1;
            current1 = current1.next;
            currentResult = currentResult.next;
        }
        while (current2 != null){
            currentResult.next = current2;
            current2 = current2.next;
            currentResult = currentResult.next;
        }
        return headResult.next;
    }
}
// @lc code=end

