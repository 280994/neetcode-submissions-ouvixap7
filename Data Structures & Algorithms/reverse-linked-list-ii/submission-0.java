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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode node = new ListNode(0, head);
        ListNode prev = node;
        ListNode curr = head;

        for(int i=1; i<left; i++){
            prev=curr;
            curr=curr.next;
        }

        ListNode dummy = null;

        for(int i=0; i<right-left+1; i++){
            ListNode temp = curr.next;
            curr.next=dummy;
            dummy=curr;
            curr=temp;
        }

        prev.next.next=curr;
        prev.next=dummy;

        return node.next;

    }
}