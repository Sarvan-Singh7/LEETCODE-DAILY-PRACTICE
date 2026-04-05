class Pair{
    int max;
    int min;
    int sum;
    boolean isBST;
    public Pair(int max, int min, int sum, boolean isBST){
        this.max = max;
        this.min = min;
        this.sum = sum;
        this.isBST = isBST;
    }
}
class Solution {
    static int maxSum; 
    public int maxSumBST(TreeNode root) {
        maxSum=0;     //u have to initialize it here otherwise works different
        Validate(root);
        return maxSum;
    }
    public Pair Validate(TreeNode root){   //postORDER Traversal
        if(root == null)return new Pair(Integer.MIN_VALUE, Integer.MAX_VALUE,0,true);
        Pair lst = Validate(root.left);
        Pair rst = Validate(root.right);
        int max = Math.max(root.val, Math.max(lst.max,rst.max));
        int min = Math.min(root.val, Math.min(lst.min,rst.min));
        int size = root.val + lst.sum + rst.sum;
        boolean isTrue = lst.isBST && rst.isBST && (lst.max < root.val) && (rst.min > root.val); //to make sure it is valid
        if(isTrue){       //if validated then add its sum
            maxSum = Math.max(maxSum, size);
        }
        return new Pair(max, min, size, isTrue);
    }
}