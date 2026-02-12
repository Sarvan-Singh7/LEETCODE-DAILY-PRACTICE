
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null)return false;   // activates when we reach to null
        if(root.left == null && root.right == null){ //activates when we reach to leaf node or one step before null
            if(root.val == targetSum)return true;  //as we are decreasing targetSum by root.val so at any step when it is equal at leaf so correct path
            else return false;  //if not path so return false
        }
       return  hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right , targetSum - root.val); // if nay one path exits then also path exists
    }
}