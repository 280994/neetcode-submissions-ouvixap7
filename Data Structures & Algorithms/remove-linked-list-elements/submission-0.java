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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy=new ListNode(0, head);
        ListNode curr=head;
        ListNode prev = dummy;

        while(curr!=null){
            ListNode temp=curr.next;
            if(curr.val == val){
                prev.next=temp;
            }
            else{
                prev=curr;
            }
            curr=temp;
        }
        return dummy.next;

    }
}