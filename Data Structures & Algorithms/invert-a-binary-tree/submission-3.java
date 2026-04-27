/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public TreeNode invertTree(TreeNode root) {
        TreeNode curr = root;
        Queue<TreeNode> q = new LinkedList<>();
        if(curr!=null){
            q.add(curr);
        }
        else{
            return curr;
        }
        

        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size;i++){
                TreeNode node = q.poll();
                TreeNode temp = node.right;
                node.right=node.left;
                node.left=temp;
                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
            }
        }
        return curr;
    }
}
