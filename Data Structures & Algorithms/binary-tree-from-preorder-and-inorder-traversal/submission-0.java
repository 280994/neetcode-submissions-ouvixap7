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
    int pIndex;
    int iIndex=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0 || inorder.length == 0){
            return null;
        }  
        this.pIndex = 0;
        this.iIndex = 0;
        return helper(preorder, inorder, Long.MIN_VALUE);
    }

    private TreeNode helper(int[] preorder, int[] inorder, long preVal){
        if(pIndex==preorder.length){
            return null;
        }
        if(inorder[iIndex]==preVal){
            iIndex++;
            return null;
        }
        TreeNode root = new TreeNode(preorder[pIndex++]);
        root.left = helper(preorder, inorder, root.val);
        root.right = helper(preorder, inorder, preVal);
        return root;
    }
}
