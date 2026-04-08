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
        result=root.val;
        dfs(root);
        return result;
    }

    private int dfs(TreeNode root){
        if(root==null){
            return 0;
        }

        int left = dfs(root.left);
        int right = dfs(root.right);

        if(left<0){
            left=0;
        }
        if(right<0){
            right=0;
        }

        result=Math.max(result, root.val+left+right);
        return root.val+Math.max(left, right);
    }
}
