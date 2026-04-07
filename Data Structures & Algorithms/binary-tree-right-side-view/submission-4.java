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
        Queue<TreeNode> bfs = new LinkedList<>();
        if(root==null){
            return result;
        }
        bfs.offer(root);

        while(!bfs.isEmpty()){
            int size = bfs.size();
            TreeNode rightNode=null;
            for(int i=0; i<size;i++){
                rightNode=bfs.poll();
                if(rightNode.left!=null){
                    bfs.offer(rightNode.left);
                }
                if(rightNode.right!=null){
                    bfs.offer(rightNode.right);
                }
            }
            if(rightNode!=null){
                result.add(rightNode.val);
            }
        }
        return result;
    }
}
