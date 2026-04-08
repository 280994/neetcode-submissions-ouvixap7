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

public class Codec {

    private List<String> result;
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        result=new ArrayList<>();
        helperSerialize(root);
        return result.stream().collect(Collectors.joining(","));
    }

    private void helperSerialize(TreeNode root){
        if(root==null){
            result.add("N");
            return;
        }
        result.add(String.valueOf(root.val));
        helperSerialize(root.left);
        helperSerialize(root.right);

    }

    private int index;
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        index=0;
        String[] values = data.split(",");
        return helperDeserialize(values);
    }

    private TreeNode helperDeserialize(String[] values){
        if(values[index].equals("N")){
            index++;
            return null;
        }

        TreeNode node = new TreeNode(Integer.valueOf(values[index]));
        index++;
        node.left = helperDeserialize(values);
        node.right = helperDeserialize(values);
        return node;
    }
}
