
class Solution {
    public static void helper(TreeNode root,ArrayList<Integer> answer){
        if(root == null)return;
        helper(root.left, answer);
        helper(root.right, answer);
        answer.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> answer = new ArrayList<>();
       helper(root, answer);
       return answer;
    }
}