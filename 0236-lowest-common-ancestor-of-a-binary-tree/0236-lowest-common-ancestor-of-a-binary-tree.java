
class Solution {   //nearabout o(n)
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)return null;
        if(root.val == p.val || root.val == q.val)return root;   //if at any point we are at point when root becomes p q o finded
        boolean pLiesInLeft = check(root.left,p);
        boolean qLiesInRight = check(root.right,q);  //see we are not checking in rightsubtree 
        if(pLiesInLeft && !qLiesInRight){           //if both in left then defanately find in next iteration leftwards
            return lowestCommonAncestor(root.left, p, q);
        }
        else if(!pLiesInLeft && qLiesInRight){   /////if in rightsub tree
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