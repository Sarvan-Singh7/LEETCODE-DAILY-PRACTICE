class Solution {
    //inorder when current.left == null
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        TreeNode current = root;
        while(current != null  ||   st.size() >0){  ///do in this sequence and && cannot be used instead of ||
            if(current != null){
                if(current.left != null){
                    st.push(current);
                    current = current.left;
                }else{
                    answer.add(current.val);
                    current = current.right;
                }
            }
            else{
                TreeNode top = st.pop();
                answer.add(top.val);
                current = top.right;
            }
        }
        return answer;
    }
 }





// class Solution {
//     public static void helper(List<Integer> arr, TreeNode root){
//         if(root == null)return;
//         helper(arr, root.left);
//         arr.add(root.val);
//         helper(arr, root.right);
//     }
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> arr = new ArrayList<>();
//         helper(arr, root);
//         return arr;
//     }
//  }
