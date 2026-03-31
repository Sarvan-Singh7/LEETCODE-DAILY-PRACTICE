//ITERATIVE SOLUTION LIKE BFS APPROACH
class Solution {
    
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        if(root == null)return arr;
        
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(st.size() > 0){
            TreeNode current = st.pop();
            arr.add(current.val);
            if(current.right != null)st.push(current.right);
            if(current.left != null)st.push(current.left);
        }
        return arr;
    }
    
}
////RECURSIVE SOLUTION AS IT IS
// class Solution {
//     public static void helper(ArrayList<Integer> arr, TreeNode root){
//         if(root == null)return;
//         arr.add(root.val);
//         helper(arr, root.left);
//         helper(arr, root.right);
//     }
//     public List<Integer> preorderTraversal(TreeNode root) {
//         ArrayList<Integer> arr = new ArrayList<>();
//         helper(arr, root);
//         return arr;
//     }
// }