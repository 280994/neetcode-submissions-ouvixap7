/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node curr = head;
        Map<Node, Node> oldToNew = new HashMap<>();
        // oldToNew.put(null, null);

        while(curr!=null){
            Node newNode = new Node(curr.val);
            oldToNew.put(curr,newNode);
            curr=curr.next;
        }

        curr = head;

        while(curr!=null){
            Node newNode = oldToNew.get(curr);
            newNode.next = oldToNew.get(curr.next);
            newNode.random = oldToNew.get(curr.random);
            curr=curr.next;
        }

        return oldToNew.get(head);

    }
}
