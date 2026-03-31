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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode middle = slow.next;
        slow.next=null;
        ListNode prev = null;
        while(middle!=null){
            ListNode temp = middle.next;
            middle.next=prev;
            prev=middle;
            middle=temp;
        }

        middle = prev;
        while(middle!=null){
            ListNode temp1=head.next;
            ListNode temp2 = middle.next;
            head.next=middle;
            middle.next=temp1;
            head=temp1;
            middle=temp2;
        }
    }
}
