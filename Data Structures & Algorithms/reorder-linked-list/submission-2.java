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
        ListNode fast = curr,next;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode middle = slow.next;
        ListNode prev = null;
        while(middle!=null){
            ListNode temp = middle.next;
            middle.next = prev;
            prev=middle;
            middle=temp;
        }

        slow.next=null;
        while(prev!=null){
            ListNode temp1 = curr.next;
            ListNode temp2 = prev.next;
            curr.next=prev;
            prev.next = temp1;
            curr=temp1;
            prev=temp2;
        }
    }
}
