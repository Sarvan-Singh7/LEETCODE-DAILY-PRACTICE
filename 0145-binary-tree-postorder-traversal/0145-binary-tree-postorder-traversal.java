//////////////ITERATIVE APPROACH
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> answer = new ArrayList<>();
        if(root == null)return answer;    ///iske bina pura code hi galat
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(st.size() > 0){
            TreeNode current = st.pop();
            answer.add(current.val);
            if(current.left != null)st.push(current.left);   //current ka left pehle na ki root and then current ka right
            if(current.right != null)st.push(current.right);
        }
        Collections.reverse(answer);  ///as resultant array was reversed postorder so need to reverse it
        return answer;
}
}
///RECURSIVE APPROACH
// class Solution {
//     public static void helper(TreeNode root,ArrayList<Integer> answer){
//         if(root == null)return;
//         helper(root.left, answer);
//         helper(root.right, answer);
//         answer.add(root.val);
//     }
//     public List<Integer> postorderTraversal(TreeNode root) {
//         ArrayList<Integer> answer = new ArrayList<>();
//        helper(root, answer);
//        return answer;
//     }
// }