//SSE CAREFULLY AS BALANCED MEAN THAT LEFT AND RIGHT SUBTREE ANY LEVEL MUST HAVE HEIGHT OR DEPTH <= 1 

/////BELOW IS OPTIMAL CODE WITH HELP OF LEVES CALCULATE CODE
class Solution {
    static boolean flag = false;
    public boolean isBalanced(TreeNode root) {   ////COMPLEXITY = O(N SQUARE) BECAUSE ONE CALL GOES FOR O(N) SO INNER CALL FOR LEVELS CALCULATION ALSO
        if(root == null)return true;
        flag = true;
        levels(root);
        if(flag == false)return false;
        return true;
    }
    public int levels(TreeNode root){
        if(root == null)return 0;
        int left = levels(root.left);
        int right = levels(root.right);
        if(Math.abs(left - right) >=2)flag = false;
        return 1 + Math.max(left, right);
    }
  
}





//NOW SO IN FUNCTION I CALCULATED HEIGHT FOR EACH SUBTREE AND THEN CAMPARE ITS ABSOLUTE VALUE O CHECK IS IT VALID
//AND RETURN APPROPRIATELY
// class Solution {
//     public boolean isBalanced(TreeNode root) {   ////COMPLEXITY = O(N SQUARE) BECAUSE ONE CALL GOES FOR O(N) SO INNER CALL FOR LEVELS CALCULATION ALSO
//         if(root == null)return true;
//         int leftSubTreeDepth = levels(root.left);
//         int rightSubTreeDepth = levels(root.right);
//         if(Math.abs(leftSubTreeDepth - rightSubTreeDepth) >=2)return false;

//         return isBalanced(root.left) && isBalanced(root.right);
//     }
//     public int levels(TreeNode root){
//         if(root == null)return 0;
//         return 1 + Math.max(levels(root.left), levels(root.right));
//     }
// }