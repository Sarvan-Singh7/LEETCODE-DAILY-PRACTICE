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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        int level =1;
        if(root == null)return answer;
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> arr = new ArrayList<>();
            int n = q.size();
            for(int i=0;i<n;i++){
                TreeNode front = q.poll();
                arr.add(front.val);
                if(front.left != null)q.add(front.left);
                if(front.right != null)q.add(front.right);
            }
            ///now 1D array toh bana liya so in order to Insert just do check
            if(level %2 == 0){
                Collections.reverse(arr);   
            }
            level++;
            answer.add(arr);
        }

        return answer;
    }
}