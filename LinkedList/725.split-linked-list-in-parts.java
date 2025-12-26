/*
 * @lc app=leetcode id=725 lang=java
 *
 * [725] Split Linked List in Parts
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
            
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] array = new ListNode[k];
        ListNode curr = head;
        int count = 0;
        while (curr != null){
            curr = curr.next;
            count++;
        }
        int du = count%k;
        int fixedInArr = count/k;

        for (int i=0; i<k; i++){
            array[i] = head;
            ListNode prev = null;
            int temp = fixedInArr;
            while (head != null && (temp + (du > 0 ? 1 : 0)) > 0){
                prev = head;
                head = head.next;
                temp--;
                // du--; sai
            }
            du--;
            if (prev != null) {
                prev.next = null;
            }
        }
        return array;
    }
}
// @lc code=end

