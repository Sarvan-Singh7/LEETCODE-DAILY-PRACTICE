class Solution {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);////as need to find medain because after this we can calculate sum of all deviations
        int median  = nums[n/2];
        int moves =0;
        for(int i=0; i<n;i++){
            moves += Math.abs(nums[i] - median);
        }
        return moves;
    }
}