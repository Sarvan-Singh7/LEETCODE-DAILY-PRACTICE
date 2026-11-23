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
    static long mini = Long.MAX_VALUE;
    static long secMin = Long.MAX_VALUE;
    public int findSecondMinimumValue(TreeNode root) {
         mini = Long.MAX_VALUE;
         secMin = Long.MAX_VALUE;
         preOrder(root);
         return (secMin == Long.MAX_VALUE)?-1:(int)secMin;
    }
    public static void preOrder(TreeNode root){
        if(root == null)return;
        if(root.val < mini){
            mini = root.val;
        }
        if(root.val < secMin && root.val != mini){
            secMin = root.val;
        }
        
        preOrder(root.left);
        preOrder(root.right);
         
    }
}