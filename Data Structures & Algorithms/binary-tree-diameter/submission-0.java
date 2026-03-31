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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] sum= new int[1];
        this.diameterOfNode(root, sum);
        return sum[0];
    }

    private int diameterOfNode(TreeNode node, int[] sum){
        if(node==null){
            return 0;
        }

        int maxLeft = diameterOfNode(node.left, sum);
        int maxRight = diameterOfNode(node.right, sum);
        sum[0] = Math.max(sum[0], maxLeft+maxRight);
        return 1 + Math.max(maxLeft, maxRight);
    }
}
