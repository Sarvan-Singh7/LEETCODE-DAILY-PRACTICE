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
    public static void solveKaro(List<List<Integer>> answer, TreeNode root){
        if(root == null)return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.size() > 0){
            int n= q.size();
            List<Integer> helper = new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode front = q.remove();
                helper.add(front.val);
                if(front.left != null)q.add(front.left);
                if(front.right != null)q.add(front.right);
            }
            answer.add(0,helper);     ////YE DEKHO AGAR HUM 0 INDEX PE BAAR BAAR ARRAYLIST MEIN ELEMENTS ADD KARENGE SO BAKI WALE ELEMENTS AAGE SHIFT HOTE RAHENGE
        }
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> answer  =  new ArrayList<>();
        solveKaro(answer, root);
        return answer;
}
}