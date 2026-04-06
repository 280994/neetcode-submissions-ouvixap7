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
        if(root==null){
            return null;
        }

        Queue<TreeNode> bfs = new LinkedList<>();
        bfs.add(root);

        while(!bfs.isEmpty()){
            TreeNode node = bfs.poll();
            TreeNode temp = node.left;
            node.left=node.right;
            node.right=temp;
            if(node.left!=null){
                bfs.add(node.left);
            }
            if(node.right!=null){
                bfs.add(node.right);
            }
        }

        return root;
    }
}
