//step 1 = find in which left subtree  p located and vica versa for q.

//step 2 = if else ladder
          //->if(p lies in left subtree from current root and q not in right subtree)so now please search in leftsub tree so left++;
          //->if-else(q lies in right subtree but p not in left sub tree so )move right
          //->else{means that p in left sub tree and q in right sub tree }so certain that current root is the ancestor in common
          
//step 3 = just make a check function that return boolean result

class Solution {   //nearabout o(n) but in worst case it is O(nsquare)
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)return null;
        if(root.val == p.val || root.val == q.val)return root;
        boolean pInLeft = check(root.left,p.val);
        boolean qInRight = check(root.right,q.val);
        if(pInLeft && !qInRight){
            return lowestCommonAncestor(root.left,p,q);
        }else if(!pInLeft && qInRight){
            return lowestCommonAncestor(root.right,p,q);
        }else{
            return root;
        }
    }
    public boolean check(TreeNode root,int val ){
        if(root == null)return false;
        if(root.val == val)return true;
        return check(root.left, val) || check(root.right, val);
    }   
}














// class Solution {   //nearabout o(n)
//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         if(root == null)return null;
//         if(root.val == p.val || root.val == q.val)return root;   //if at any point we are at point when root becomes p q o finded
//         boolean pLiesInLeft = check(root.left,p);
//         boolean qLiesInRight = check(root.right,q);  //see we are not checking in rightsubtree 
//         if(pLiesInLeft && !qLiesInRight){           //if both in left then defanately find in next iteration leftwards
//             return lowestCommonAncestor(root.left, p, q);
//         }
//         else if(!pLiesInLeft && qLiesInRight){   /////if in rightsub tree
//             return lowestCommonAncestor(root.right, p, q);
//         }
//         else{
//             return root;   //executes when p in left and q in right so LCA is root 
//         }
//     }



//     public static boolean check(TreeNode root, TreeNode val){
//         if(root == null)return false;
//         if(root.val == val.val)return true;
//         return check(root.left, val) || check(root.right, val);
//     }
// }
