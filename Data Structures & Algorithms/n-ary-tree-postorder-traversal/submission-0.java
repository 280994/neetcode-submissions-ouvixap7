/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    public List<Integer> postorder(Node root) {
        Stack<Pair<Node, Boolean>> nodeStack = new Stack<>();
        List<Integer> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        nodeStack.push(new Pair<>(root, false));

        while(!nodeStack.isEmpty()){
            Pair<Node, Boolean> curr = nodeStack.pop();
            Node currNode = curr.getKey();
            Boolean visited = curr.getValue();

            if(visited){
                result.add(currNode.val);
            }
            else{
                nodeStack.push(new Pair<>(currNode, true));
                for(int i=currNode.children.size()-1; i>=0; i--){
                    nodeStack.push(new Pair<>(currNode.children.get(i), false));
                }
            }
        }
        return result;
    }
}