class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<n;i++){
            largest = Math.max(largest, nums[i]);
        }
        int moves = 0;
        for(int i=0; i<n;i++){
            moves += (largest - nums[i]);
        }
        return moves;
    }
}