  class Solution {  ///will use extra space or an extra array to compute it
    public int rob(int[] nums) {
        int n = nums.length;
        if(n<2)return nums[0];
        int dp[] = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for(int i=2;i<n;i++){
            dp[i] = Math.max(dp[i-2] + nums[i] , dp[i-1]);
        }
        return dp[n-1];
    }
}
  
  
  
  
  
  
  
// class Solution {   ======= NOT WORKING CODE AS WE CAN ALSO CHOOSE RANDOM BUT NOT ALTERNATIVE
//     public int rob(int[] nums) {
//         int n = nums.length;
//         if(n==1)return nums[0];

//         int maxi = Integer.MIN_VALUE;
//         int sum2 =0;
//         int sum1=0;
//         for(int i=0;i<n;i+=2){
//             sum1+= nums[i];
//         }
//         for(int i=1;i<n;i+=2){
//             sum2+= nums[i];
//         }
//         return Math.max(sum1, sum2);
//     }
// }