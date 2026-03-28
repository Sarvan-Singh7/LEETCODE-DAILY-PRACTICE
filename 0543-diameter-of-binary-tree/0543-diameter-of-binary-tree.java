
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)return 0;
        int a1 =helperLevel(root.left) + helperLevel(root.right);
        int a2 = diameterOfBinaryTree(root.left);
        int a3 =diameterOfBinaryTree(root.right);
        return Math.max(a1, Math.max(a2,a3));
    }
    public int helperLevel(TreeNode p){
        if(p == null)return 0;
        return 1 + Math.max(helperLevel(p.left), helperLevel(p.right));
    }
}




// class Solution {   == not working as always calculaed largest in terms of root
//     public int diameterOfBinaryTree(TreeNode root) {
//         if(root == null) return 0;
//         return helperLevel(root.left) + helperLevel(root.right);    //calculated levels for left subtree and right subtree and return addition of both as diameter is longest path from one node to another
//     }
//     public int helperLevel(TreeNode p){
//          if(p == null)return 0;
//          return 1 + Math.max(helperLevel(p.left), helperLevel(p.right));
//     }
// }