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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)return true;  // if both null so also same
        if(p == null || q ==null) return false;  // if one null and other not then this activates because of upper condition
        if(p.val != q.val) return false;    // as given in question
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right); // & operator used so booolean result
    }
}