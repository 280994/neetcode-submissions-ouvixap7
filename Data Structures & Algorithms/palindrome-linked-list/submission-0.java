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
    public boolean isPalindrome(ListNode head) {
        ListNode curr = head;
        ListNode slow=curr;
        ListNode fast=curr;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode prev=null;

        while(slow!=null){
            ListNode temp = slow.next;
            slow.next=prev;
            prev=slow;
            slow=temp;
        }

        while(prev!=null){
            if(curr.val!=prev.val){
                return false;
            }
            curr=curr.next;
            prev=prev.next;
        }
        return true;
    }
}