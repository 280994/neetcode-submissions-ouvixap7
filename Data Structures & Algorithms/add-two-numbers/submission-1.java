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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first = l1;
        ListNode second = l2;
        int carry = 0;
        ListNode result = new ListNode(0);
        ListNode node=result;
        while(first!=null || second!=null || carry>0){
            int val1 = first!=null?first.val:0;
            int val2 = second!=null?second.val:0;
            int sum = val1+val2+carry;
            carry=sum/10;
            ListNode curr=new ListNode(sum%10);
            node.next=curr;
            first=first!=null?first.next:null;
            second=second!=null?second.next:null;
            node=node.next;
        }
        return result.next;
    }
}
