
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        View(root,arr,0);
        return arr;
    }
    public static void View(TreeNode root, List<Integer> arr, int levels){
        if(root == null)return;

        if(levels >= arr.size()){
            arr.add(root.val);
        }else{
            arr.set(levels, root.val);
        }
        View(root.left, arr, levels+1);
        View(root.right,arr, levels+1);
    }
}