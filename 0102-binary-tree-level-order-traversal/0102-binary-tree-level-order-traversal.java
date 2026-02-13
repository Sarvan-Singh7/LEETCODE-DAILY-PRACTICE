class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> arr = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null)return arr;
        q.add(root);

        while(q.size() >0){
            int currnetLevelSize = q.size(); /// as size change for every level so store
            List<Integer> helper = new ArrayList<>();//initialize everytime
            for(int i=0;i<currnetLevelSize;i++){ //iterate on size to store that element to helper
                TreeNode front = q.remove();
                helper.add(front.val);
                if(front.left != null)q.add(front.left);
                if(front.right != null)q.add(front.right);
            }
            arr.add(helper);  // at last add helper to 2D arrayList and again after it while loop run 
        }
        return arr;
    }
}



////ERONG ANSWER AS PUT ALL IN SINGLE MANNER


// class Solution {
//     public List<List<Integer>> levelOrder(TreeNode root) {
//         List<List<Integer>> arr = new ArrayList<>();
//         Queue<TreeNode> q = new LinkedList<>();
//         if(root == null)return arr;
//         q.add(root);

//         while(q.size() >0){
            
//             TreeNode front = q.remove();
//             List<Integer> helper = new ArrayList<>();
//             helper.add(front.val);
//             if(front.left != null)q.add(front.left);
//             if(front.right != null)q.add(front.right);
//             arr.add(helper);
//         }
//         return arr;
//     }
// }