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
        TreeNode curr = root;
        bfs.offer(curr);

        while(!bfs.isEmpty()){
            int size = bfs.size();
            for(int i=0; i<size;i++){
                TreeNode node = bfs.poll();
                TreeNode temp = node.left;
                node.left = node.right;
                node.right = temp;
                if(node.left!=null){
                    bfs.offer(node.left);
                }
                if(node.right!=null){
                    bfs.offer(node.right);
                }
            }
        }
        return curr;
    }

}
