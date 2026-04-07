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
        int[] result=new int[1];
        dfs(root, root.val, result);
        return result[0];
    }

    private void dfs(TreeNode root, int maxValue, int[] result){
        if(root==null){
            return;
        }

        if(root.val>=maxValue){
            result[0]++;
        }

        maxValue=Math.max(maxValue,root.val);
        dfs(root.left, maxValue, result);
        dfs(root.right, maxValue, result);
    }
}
