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

 public class Pair{
    long max;
    long min;
    public Pair(long max, long min){
        this.max = max;
        this.min = min;

    }
 }
class Solution {
    
    static boolean flag;
    public boolean isValidBST(TreeNode root) {
        if(root.left == null && root.right == null)return true;
        flag = true;
        maxmin(root);
        return (flag == false)?false:true;
    }
    Pair maxmin(TreeNode root){
        if(root == null)return new Pair(Long.MIN_VALUE, Long.MAX_VALUE);
        Pair lsb = maxmin(root.left);
        Pair rsb = maxmin(root.right);
        long maxi = Math.max(root.val, Math.max(lsb.max,rsb.max)); //lsb.max karke specify as it has 2 values
        long mini = Math.min(root.val, Math.min(lsb.min,rsb.min));
        if(lsb.max >= root.val || rsb.min <= root.val)flag = false;//lsb.max taken , not maxi and mini
        return new Pair(maxi, mini);
    }
}