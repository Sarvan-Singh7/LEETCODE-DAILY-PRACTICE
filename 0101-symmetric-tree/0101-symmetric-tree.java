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
    public boolean isSymmetric(TreeNode root) {
        if(root == null)return true;
        return HelpSymmetric(root.left, root.right);
    }
    public boolean HelpSymmetric(TreeNode leftNode, TreeNode rightNode){
        if(leftNode == null || rightNode == null){
            return leftNode  == rightNode;
        }
        if(leftNode.val != rightNode.val)return false;

        return HelpSymmetric(leftNode.left, rightNode.right) && HelpSymmetric(leftNode.right, rightNode.left);
    }
}