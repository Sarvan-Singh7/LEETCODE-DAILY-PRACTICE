
class Solution {
    public static TreeNode convert(int[] nums, int si, int ei){
        if(si > ei)return null;
        int mid = si + (ei - si)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = convert(nums, si, mid -1);
        root.right = convert(nums, mid+1, ei);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return convert(nums, 0 , nums.length -1);
    }
}