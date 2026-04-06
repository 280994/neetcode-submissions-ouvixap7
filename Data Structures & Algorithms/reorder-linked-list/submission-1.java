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
        ListNode curr = head;
        ListNode slow = curr;
        ListNode fast = curr.next;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        ListNode middle = slow.next;
        slow.next=null;
        ListNode prev=null;

        while(middle!=null){
            ListNode temp = middle.next;
            middle.next=prev;
            prev=middle;
            middle=temp;
        }

        while(prev!=null){
            ListNode temp = curr.next;
            ListNode temp2 = prev.next;
            curr.next=prev;
            prev.next=temp;
            curr=temp;
            prev=temp2;
        }
    }
}
