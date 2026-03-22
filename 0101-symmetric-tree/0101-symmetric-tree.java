
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null)return true;
        return HelpSymmetric(root.left, root.right);  //leftSubTree and rightSubTree ka partition lagakar bhej diya 2 trees from 1
    }
    public boolean HelpSymmetric(TreeNode leftNode, TreeNode rightNode){ //checking that 2 trees are identical or not
        if(leftNode == null || rightNode == null){//agar ek condition true matlab ek null pe and ek nahin so return false as == used below
            return leftNode  == rightNode; //agar dono null pe toh hi true
        }
        if(leftNode.val != rightNode.val)return false;  //value not match so return false

        return HelpSymmetric(leftNode.left, rightNode.right) && HelpSymmetric(leftNode.right, rightNode.left);
        //upper traversal mein ek node ka left badhao and dusre ka right as mirror hai center se .
    }
}