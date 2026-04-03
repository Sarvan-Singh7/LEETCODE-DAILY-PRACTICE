
class Solution {
    int k2;int answer;
    public int kthSmallest(TreeNode root, int k) {
        k2 =k;
        ArrayList<Integer> arr = new ArrayList<>();
        if(root == null)return 0;
        Inorder(root);
        return answer;
    }
    public void Inorder(TreeNode root){
        if(root == null)return;
        Inorder(root.left);
        k2--;   ///each time index decrease so it comes to that point
        if(k2 ==0)answer = root.val;
        Inorder(root.right);
    }
}




// class Solution {   === O(n) SC but using extra array
//     public int kthSmallest(TreeNode root, int k) {
//         ArrayList<Integer> arr = new ArrayList<>();
//         if(root == null)return 0;
//         Inorder(root, arr);
//         return arr.get(k-1);
//     }
//     public void Inorder(TreeNode root, ArrayList<Integer> arr){
//         if(root == null)return;
//         Inorder(root.left,arr);
//         arr.add(root.val);
//         Inorder(root.right, arr);
//     }
// }