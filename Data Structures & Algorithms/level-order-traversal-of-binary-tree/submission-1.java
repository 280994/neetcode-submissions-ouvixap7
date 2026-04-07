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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> bfs = new LinkedList<>();
        if(root==null){
            return result;
        }
        bfs.offer(root);

        while(!bfs.isEmpty()){
            int size = bfs.size();
            List<Integer> nodes = new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode curr = bfs.poll();
                nodes.add(curr.val);
                if(curr.left!=null){
                    bfs.offer(curr.left);
                }
                if(curr.right!=null){
                    bfs.offer(curr.right);
                }
            }
            result.add(nodes);
        }
        return result;
    }
}
