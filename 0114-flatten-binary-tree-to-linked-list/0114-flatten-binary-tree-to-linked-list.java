class Solution {   //==Simply Convert it to Skewed Binary tree so that it will be possibel inPlace
    public void flatten(TreeNode root) {
       if(root == null)return;
       TreeNode lst = root.left;
       TreeNode rst = root.right;
       root.left = null;
       flatten(lst);
       flatten(rst);
       root.right = lst;
       TreeNode last = root;
       while(last.right != null){
        last = last.right;
       }
       last.right = rst;

    }
    
}
// class Solution {   //==Simply Convert it to Skewed Binary tree so that it will be possibel inPlace
//     public void flatten(TreeNode root) {
//         ArrayList<TreeNode> arr = new ArrayList<>();
//         preOrder(root, arr);    //smae node reference passed so it is sure that pass by reference so that a refer to root in next step
//         for(int i=0;i<arr.size() - 1;i++){
//             TreeNode a = arr.get(i);
//             TreeNode b = arr.get(i+1);
//             a.right =b;
//             a.left = null;
//         }
        

//     }
//     public static void preOrder(TreeNode root, ArrayList<TreeNode> arr){
//         if(root == null)return ;
//         arr.add(root);
//         preOrder(root.left, arr);
//         preOrder(root.right, arr);
//     }
// }