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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return dfs(root1, root2);
    }

    private TreeNode dfs(TreeNode root1, TreeNode root2){
        if(root1==null && root2==null){
            return null;
        }
        int value;
         
        if(root1!=null && root2==null){
            value = root1.val;
        }
        else if(root1==null && root2!=null){
            value = root2.val;
        }
        else{
            value = root2.val+root1.val; 
        }
        TreeNode node = new TreeNode(value);
        node.left = dfs((root1 != null) ? root1.left : null, (root2 != null) ? root2.left : null);
        node.right = dfs((root1 != null) ? root1.right : null, (root2 != null) ? root2.right : null);
        return node;
    }
}