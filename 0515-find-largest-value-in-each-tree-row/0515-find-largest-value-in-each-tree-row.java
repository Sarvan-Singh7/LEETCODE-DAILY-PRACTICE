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
    public static void BFS(TreeNode root, List<Integer> arr){
        if(root == null)return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.size() >0 ){
            int n=q.size();
            int maxi = Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                TreeNode front = q.remove();
                maxi = Math.max(front.val, maxi);
                if(front.left != null)q.add(front.left);
                if(front.right != null)q.add(front.right);
            }
            arr.add(maxi);
        }
    }
    public List<Integer> largestValues(TreeNode root) {
          List<Integer> arr = new ArrayList<>();
          BFS(root, arr);
          return arr;
    }
}