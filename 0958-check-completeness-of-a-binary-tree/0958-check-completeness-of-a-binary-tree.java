
class Solution {
    public boolean isCompleteTree(TreeNode root) {
        if(root == null)return true;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.peek() != null){//jab tak  null TreeNode nahin aati tak tak daalte jao
            TreeNode front =q.poll();
            q.add(front.left);
            q.add(front.right); 
        }
        //agar complete hoga toh last ke all null honge   so if null ke baad value aya so break loop and say it is not valid
        while(!q.isEmpty() && q.peek() == null){
            q.poll();
        }
        return q.isEmpty();///because agar complete hoga toh sare null while looop khatam kar dega
    }
}