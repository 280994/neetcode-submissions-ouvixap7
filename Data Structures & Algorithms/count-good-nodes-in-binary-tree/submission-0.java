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
        return countGoodNodes(root, root.val);
    }

    private int countGoodNodes(TreeNode node, int maxValue){
        if(node==null){
            return 0;
        }
        int result;
        if(node.val>=maxValue){
            result=1;
        }
        else{
            result =0;
        }
        maxValue = Math.max(maxValue, node.val);
        result=result+countGoodNodes(node.left, maxValue);
        result=result+countGoodNodes(node.right, maxValue);
        return result;
    }
}
