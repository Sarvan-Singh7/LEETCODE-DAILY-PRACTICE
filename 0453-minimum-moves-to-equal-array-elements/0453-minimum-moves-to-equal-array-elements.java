class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int smallest =Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            smallest = Math.min(smallest, nums[i]);
        }
        ///now all elements ko minus karo from smallest and add all result
        int result =0;
        for(int i=0; i<n;i++){
            result += (nums[i] - smallest);
        }
        return result;
    }
}