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
        Stack<Integer> s1 = new Stack();
        Stack<Integer> s2 = new Stack();
        ListNode node1 = l1;
        ListNode node2 = l2;
        while(node1!=null){
            s1.push(node1.val);
            node1=node1.next;
        }

        while(node2!=null){
            s2.push(node2.val);
            node2=node2.next;
        }
        int carry =0;
        ListNode head = null;
        while(!s1.isEmpty() || !s2.isEmpty() || carry>0){
            int val1 = s1.size()>0?s1.pop():0;
            int val2 = s2.size()>0?s2.pop():0;
            int sum = val1+val2+carry;
            ListNode curr = new ListNode(sum%10);
            carry=sum/10;
            curr.next=head;
            head=curr;
        }

        return head;
    }
}