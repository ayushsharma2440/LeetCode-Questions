/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode curr = node;
        ListNode next = null;
        ListNode prev = null;
        while (curr!=null && curr.next!=null){
            next=curr.next;
            curr.val = next.val;
            prev = curr;
            curr=curr.next;
        }
        prev.next = null;
    }
}