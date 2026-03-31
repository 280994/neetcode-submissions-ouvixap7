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

    int result;

    public int maxPathSum(TreeNode root) {
        result = root.val;
        dfs(root);
        return result;
    }

    private int dfs(TreeNode root){
        if(root==null){
            return 0;
        }

        int maxLeft = dfs(root.left);
        int maxRight = dfs(root.right);
        if(maxRight<0){
            maxRight = 0;
        }
        if(maxLeft<0){
            maxLeft = 0;
        }

        result = Math.max(result, root.val+maxRight+maxLeft);
        return root.val+Math.max(maxRight, maxLeft);

    }
    
}
