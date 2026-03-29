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
class Solution {   //==Simply Convert it to Skewed Binary tree so that it will be possibel inPlace
    public void flatten(TreeNode root) {
        ArrayList<TreeNode> arr = new ArrayList<>();
        preOrder(root, arr);
        for(int i=0;i<arr.size() - 1;i++){
            TreeNode a = arr.get(i);
            TreeNode b = arr.get(i+1);
            a.right =b;
            a.left = null;
        }
        // TreeNode last = arr.get(arr.size() -1);
        // last.right = null;
        // last.left = null;

    }
    public static void preOrder(TreeNode root, ArrayList<TreeNode> arr){
        if(root == null)return ;
        arr.add(root);
        preOrder(root.left, arr);
        preOrder(root.right, arr);
    }
}