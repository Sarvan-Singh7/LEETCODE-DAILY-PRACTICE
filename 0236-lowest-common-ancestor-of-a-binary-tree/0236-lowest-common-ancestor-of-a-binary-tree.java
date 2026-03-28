
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)return null;
        if(root.val == p.val || root.val == q.val)return root;
        boolean pLiesInLeft = check(root.left,p);
        boolean qLiesInRight = check(root.left,q);
        if(pLiesInLeft && qLiesInRight){
            return lowestCommonAncestor(root.left, p, q);
        }
        else if(!pLiesInLeft && !qLiesInRight){
            return lowestCommonAncestor(root.right, p, q);
        }
        else{
            return root;
        }
    }
    public static boolean check(TreeNode root, TreeNode val){
        if(root == null)return false;
        if(root.val == val.val)return true;
        return check(root.left, val) || check(root.right, val);
    }
}