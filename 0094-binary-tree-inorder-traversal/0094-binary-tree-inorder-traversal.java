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
    public static void helper(List<Integer> arr, TreeNode root){
        if(root == null)return;
        helper(arr, root.left);
        arr.add(root.val);
        helper(arr, root.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        helper(arr, root);
        return arr;
    }
}