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
    static int sum =0;
    static int totalSum=0;
    static int count =0;
    public int averageOfSubtree(TreeNode root) {///main Function
        sum=0;
        totalSum =0;
        f(root);   
        return totalSum;
    }
    public static void f(TreeNode root){
        if(root == null)return;
        helperSum(root);
        if((int)sum/count == root.val)totalSum++;
        sum=0;
        count=0;
        f(root.left);
        f(root.right);
    }
    public static void helperSum(TreeNode root){
        if(root == null)return;
        sum += root.val;
        count = count+1;
        helperSum(root.left);
        helperSum(root.right);
    }
}