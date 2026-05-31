
class Solution {
    static int sum =0;
    public TreeNode bstToGst(TreeNode root) {
        sum =0;
        ArrayList<TreeNode> arr= new ArrayList<>();
        reverseInorder(root, arr);
        for(int i=0;i<arr.size();i++){
            TreeNode node = arr.get(i);
            
            sum = sum + node.val;
            node.val = sum;
        }
        return root;
    }
    public void reverseInorder(TreeNode root, ArrayList<TreeNode> arr){
        if(root == null)return;
        reverseInorder(root.right, arr);
        arr.add(root);
        reverseInorder(root.left, arr);
    }
}