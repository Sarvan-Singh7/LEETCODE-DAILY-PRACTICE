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
    public boolean isBalanced(TreeNode root) {
        if(root == null)return true;
        int leftSubTreeDepth = levels(root.left);
        int rightSubTreeDepth = levels(root.right);
        if(Math.abs(leftSubTreeDepth - rightSubTreeDepth) >=2)return false;

        return isBalanced(root.left) && isBalanced(root.right);
    }
    public int levels(TreeNode root){
        if(root == null)return 0;
        return 1 + Math.max(levels(root.left), levels(root.right));
    }
}