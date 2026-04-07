////MORRISS TRAVERSAL ASKED IN GOOGLE AS HAVING CONSTANT sc
class Solution {     //Using ITERATIVE METHOD tc = LINEAR ANS SC = CONSTANT
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        TreeNode current = root;
        while(current != null){

            if(current.left != null){ //means not inorder yet so move left once and then right till leaf
              TreeNode pred = current.left;
              while(pred.right != null && pred.right != current){//kissi bhi karan se break ho sakta hai
                pred = pred.right;
              }
              if(pred.right == null){  //fake linking
                pred.right = current;
                current = current.left;//move left as not added yet
              }
              else if(pred.right == current){///unlinking so make pred.right  to null as it was linked tocurrent in upper
                pred.right = null;
                arr.add(current.val);
                current = current.right; //move right always whenever add new one
              }
              
            }
            else{  //agar current left null so it is inorder part so add it and move current
              arr.add(current.val);
              current = current.right;  //move right always after add
            }
        }
        return arr;
    }
 }




// class Solution {     //Using ITERATIVE METHOD tc = LINEAR ANS SC = LINEAR
//     //inorder when current.left == null
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> answer = new ArrayList<>();
//         Stack<TreeNode> st = new Stack<>();
//         TreeNode current = root;
//         while(current != null  ||   st.size() >0){  ///do in this sequence and && cannot be used instead of ||
//             if(current != null){
//                 if(current.left != null){
//                     st.push(current);
//                     current = current.left;
//                 }else{
//                     answer.add(current.val);
//                     current = current.right;
//                 }
//             }
//             else{
//                 TreeNode top = st.pop();
//                 answer.add(top.val);
//                 current = top.right;
//             }
//         }
//         return answer;  ///also no need to explicitly manage null case
//     }
//  }





// class Solution {    //Using RECURSIVE METHOD tc = LINEAR ANS SC = LINEAR
//     public static void helper(List<Integer> arr, TreeNode root){
//         if(root == null)return;
//         helper(arr, root.left);
//         arr.add(root.val);
//         helper(arr, root.right);
//     }
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> arr = new ArrayList<>();
//         helper(arr, root);
//         return arr;
//     }
//  }
