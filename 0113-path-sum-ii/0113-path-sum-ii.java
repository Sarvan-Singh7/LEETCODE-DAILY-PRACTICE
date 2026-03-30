/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        Solve(answer, arr, root, targetSum);
        return answer;
    }
    public static void Solve(List<List<Integer>> answer, List<Integer> arr, TreeNode root, int sum){
        if(root == null){
            return;
        }
        arr.add(root.val);
        if(root.left == null && root.right == null ){
            if(root.val == sum){
               answer.add(new ArrayList<>(arr));
                //yhan pehle return likha tha so wrong output as not proper backtrack
            }
            
        }
        Solve(answer, arr, root.left, sum - root.val);
        Solve(answer, arr, root.right, sum -root.val);
        arr.remove(arr.size() -1);
    }
}