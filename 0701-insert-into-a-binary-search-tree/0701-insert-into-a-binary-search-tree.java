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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val);
        }
        Make(root, val);
        return root;
    }
    public static void Make(TreeNode root, int val){
        if(root == null)return;
        if(root.val < val){  //means value greter so move right
            if(root.right == null) root.right = new TreeNode(val);
            else{
                Make(root.right, val);
            }
        }
        else{
            if(root.left == null) root.left = new TreeNode(val);
            else{
                Make(root.left, val);
            }
        }
    }
}