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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n= preorder.length;
        return Build(preorder, inorder, 0, n-1, 0, n-1);

    }
    public TreeNode Build(int[] preorder, int[] inorder,int preLo,int preHi,int inLo,int inHi){
         if(preLo > preHi || inLo > inHi)return null;
         //step 1 locating value of r or root node for this recursion cylce
         int val = preorder[preLo];  //take preLo not of 0 as every recursion...
         TreeNode root = new TreeNode(val);
         int r =0;
         for(int i=inLo;i<= inHi;i++){     //do loop from inLo to inHi
            if(inorder[i] == val){
                r = i;  //stored index for doing rest game
                break;
            }
         }
         int count = r - inLo; //cannot take r - 0 as r changing in each recursion cycle;
          
         root.left = Build(preorder, inorder, preLo+1, preLo+count, inLo, r-1 );
         root.right = Build(preorder, inorder, preLo+count+1, preHi, r+1,inHi);
        
        /// return root = step2
        return root;
        
    }
}