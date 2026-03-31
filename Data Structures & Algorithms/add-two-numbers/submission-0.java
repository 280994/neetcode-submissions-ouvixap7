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
        ListNode dummy = new ListNode(0);
        ListNode result = dummy;
        int carry=0;
        while(l1!=null || l2!=null || carry!=0){
            int value1=0, value2=0;
            if(l1==null){
                value1=0;
            }
            else{
                value1=l1.val;
            }
            if(l2==null){
                value2=0;
            }
            else{
                value2=l2.val;
            }
            int sum = value1 + value2 + carry;
            
            carry = sum/10;
            int value=sum%10;
            
            result.next = new ListNode(value);
            result=result.next;
            l1=l1!=null?l1.next:null;
            l2=l2!=null?l2.next:null;
        }
        return dummy.next;
    }
}
