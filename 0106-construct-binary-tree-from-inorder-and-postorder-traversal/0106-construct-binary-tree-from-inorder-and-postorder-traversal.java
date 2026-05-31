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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        return Helper(inorder, postorder, 0,n-1, 0, n-1);
    }
    public TreeNode Helper(int[] inorder, int[] postorder, int postLow,int postHi,int inLow,int inHi){
        if(postLow > postHi || inLow > inHi){
            return null;
        }
        TreeNode root = new TreeNode(postorder[postHi]);
        int r=0;
        for(int i=inLow;i<=inHi;i++){  //we finded the index on inorder array
            if(inorder[i] == postorder[postHi]){
                r=i;
                break;
            }
        }
        int count = r - inLow;
        root.left = Helper(inorder, postorder, postLow, postLow+count -1, inLow, r-1);
        root.right = Helper(inorder, postorder, postLow+count, postHi-1, r+1, inHi);
        return root;

    }
}