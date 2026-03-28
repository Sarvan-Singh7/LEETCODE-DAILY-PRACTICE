
class Solution {
    static int diameter;
    public int diameterOfBinaryTree(TreeNode root) {  //== O(n2)  //as 2 times recursion calls
        if(root == null)return 0;     ///it works as because calculating har level ka left subtree and right subtree
        diameter =0;
        helperLevel(root);
        return diameter;
    }
    public int helperLevel(TreeNode p){
        if(p == null)return 0;
        int leftST =helperLevel(p.left);
        int rightST = helperLevel(p.right);
        diameter = Math.max(diameter, leftST + rightST);
        return 1 + Math.max(leftST, rightST);
    }
}






// class Solution {
//     public int diameterOfBinaryTree(TreeNode root) {  //== O(n2)  //as 2 times recursion calls
//         if(root == null)return 0;     ///it works as because calculating har level ka left subtree and right subtree
//         int a1 =helperLevel(root.left) + helperLevel(root.right);   //below 4 lines do preorder traversal to visit each node to calculate diamter at each point
//         int a2 = diameterOfBinaryTree(root.left);
//         int a3 =diameterOfBinaryTree(root.right);
//         return Math.max(a1, Math.max(a2,a3));  //at last max of all returned
//     }
//     public int helperLevel(TreeNode p){
//         if(p == null)return 0;
//         return 1 + Math.max(helperLevel(p.left), helperLevel(p.right));
//     }
// }




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