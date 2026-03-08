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
    ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        while (curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode removeNodes(ListNode head) {
        ListNode curr = reverse(head);
        int maxsofar = curr.val;
        ListNode revhead = curr;
        while (curr!=null && curr.next!=null){
            if (curr.next.val < maxsofar){
                curr.next = curr.next.next;
            }
            else
            {
                curr=curr.next;
                maxsofar = curr.val;
            }
        }
        ListNode ans = reverse(revhead);
        return ans;
    }
}