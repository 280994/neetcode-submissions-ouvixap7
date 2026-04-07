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
    int count=0;
    int result=0;
    public int kthSmallest(TreeNode root, int k) {
        count=k;
        findSmallest(root);
        return result;
    }

    private void findSmallest(TreeNode node){
        if(node==null){
            return;
        }

        findSmallest(node.left);
        count--;
        if(count==0){
            result=node.val;
            return;
        }

        findSmallest(node.right);
    }







}
