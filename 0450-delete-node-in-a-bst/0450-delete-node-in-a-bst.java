
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null)return null;
        if(root.val > key){
            root.left = deleteNode(root.left, key);  //root.left = , not rooot =
        }
        else if(root.val < key){
            root.right = deleteNode(root.right, key);
        }
        else {  //means target founded

          //case 1 --> when target has 0 child or it is leaf node 
          if(root.left == null && root.right == null){
            return null;  //so woh node apne se null return karegi rather than its value
          }
          if(root.left == null){
            return root.right;
          }
          if(root.right == null){
            return root.left;
          } 
          ////case 3 --> when have 2 child
          TreeNode pred = root.left;//find pred and then interchange last value of pred with root
          while(pred.right != null)pred = pred.right;
          root.left = deleteNode(root.left, pred.val); //as pred so obvois that its left may exist or not but right never exists
          pred.left = root.left;
          pred.right = root.right;
          return pred;
        }
        return root;
    }
}