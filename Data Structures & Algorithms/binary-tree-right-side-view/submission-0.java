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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null){
            return result;
        }
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            TreeNode right=null;
            for(int i=0; i<size; i++){
                TreeNode node = q.poll();
                if(node!=null){
                    right = node;
                    q.add(node.left);
                    q.add(node.right);
                }
            }
            if(right!=null){
                result.add(right.val);
            }
        }
        return result;
    }
}
