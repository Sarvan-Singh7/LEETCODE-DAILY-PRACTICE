
class Solution {
    public static void f(TreeNode root, List<String> arr,  String str){
        if(root == null)return;
        if(root.left == null && root.right == null){
            str = str+ root.val;
            arr.add(str);
            return;
        }
        f(root.left, arr, str+root.val+"->");
        f(root.right, arr, str+root.val+"->");
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> arr = new ArrayList<>();
        f(root, arr, "");
        return arr;
    }
}