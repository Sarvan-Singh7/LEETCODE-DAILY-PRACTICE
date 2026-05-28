
class Solution {
    public int findBottomLeftValue(TreeNode root) {
        int value = root.val;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            for(int i=1;i<=n;i++){
                TreeNode front  = q.poll();
                if(i == 1)value = front.val;
                if(front.left != null)q.add(front.left);
                if(front.right != null)q.add(front.right);
            }
        }
        return value;
    }
}