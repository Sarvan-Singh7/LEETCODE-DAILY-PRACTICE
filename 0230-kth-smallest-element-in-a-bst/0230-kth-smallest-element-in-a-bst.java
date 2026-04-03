
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        if(root == null)return 0;
        Inorder(root, arr);
        return arr.get(k-1);
    }
    public void Inorder(TreeNode root, ArrayList<Integer> arr){
        if(root == null)return;
        Inorder(root.left,arr);
        arr.add(root.val);
        Inorder(root.right, arr);
    }
}