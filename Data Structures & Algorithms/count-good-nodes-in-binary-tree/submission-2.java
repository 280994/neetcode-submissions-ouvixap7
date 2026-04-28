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
    public int goodNodes(TreeNode root) {
        int[] result = new int[1];
        if(root==null){
            return 0;
        }
        dfs(root, root.val, result);
        return result[0];
    }

    private void dfs(TreeNode root, int prev, int[] result){
        if(root==null){
            return;
        }
        if(root.val>=prev){
            result[0]++;
        }
        prev=Math.max(prev,root.val);
        dfs(root.left, prev, result);
        dfs(root.right, prev, result);
    }
}
