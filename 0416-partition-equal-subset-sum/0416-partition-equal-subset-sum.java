class Solution {
    public static Boolean Helper(int[] nums, int target, int index, int dp[][]){
        if(target == 0)return true;
        if(index ==0)return (nums[0] == target);
        if(dp[index][target] != -1)return (dp[index][target] == 1);///how to throw boolean result
        boolean pick = false;
        // Only pick if current number is not greater than the target
        if (nums[index] <= target) {
            pick = Helper(nums, target - nums[index], index - 1, dp);
        }
        Boolean notPick = Helper(nums, target, index-1, dp);
        dp[index][target] = (pick || notPick)? 1 :0;  ///put values in DP
        return pick || notPick;
    }
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        
        int sum =0;
        for(int num : nums){
            sum+=num;
        }
        if(sum %2 !=0)return false;    ///if sum = odd so cannot divide it into  equal 2 parts
        int dp[][] = new int[n][sum+1];
        for(int i=0;i<n;i++) Arrays.fill(dp[i], -1);
        return Helper(nums, sum/2, n-1, dp);
    }
}