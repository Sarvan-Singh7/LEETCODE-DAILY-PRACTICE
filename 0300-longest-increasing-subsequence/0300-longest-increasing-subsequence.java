// class Solution {  ///SIMPLE TRYING ALL WAYS OF IT 
//     public static int f(int nums[], int index, int prevInd, int n){
//         if(index == n)return 0;    //base Case
//         ///not take and take case
//         int notTake = 0 + f(nums, index+1, prevInd, n);
//         int take =0;
//         if(prevInd == -1 || nums[index] > nums[prevInd]){
//             take = 1 + f(nums, index+1, index, n);
//         }
//         return Math.max(take, notTake);
//     }
//     public int lengthOfLIS(int[] nums) {
//         int n = nums.length;
//         ///as i have to also consider previous index for comparision so need that start at -1 and will increase it as index increased
        
//         return  f(nums, 0, -1, n);
//     }
// }


// class Solution {    ////MEMOIZATION CODE
//     public static int f(int nums[], int index, int prevInd, int n, int dp[][]){
//         if(index == n)return 0;    //base Case
//         ///not take and take case

//         if(dp[index][prevInd + 1] != -1)return dp[index][prevInd + 1];  // see as to not take -1 s index we did prevInd +1 so(0 to n);
//         int notTake = 0 + f(nums, index+1, prevInd, n, dp);
//         int take =0;
//         if(prevInd == -1 || nums[index] > nums[prevInd]){
//             take = 1 + f(nums, index+1, index, n, dp);
//         }
//         return dp[index][prevInd+1] =  Math.max(take, notTake);
//     }
//     public int lengthOfLIS(int[] nums) {
//         int n = nums.length;
//         ///as i have to also consider previous index for comparision so need that start at -1 and will increase it as index increased
//         int dp[][] = new int[n][n+1];   //n+1 so from 0 to n index shifting by one to the right
//         for(int i=0;i<n;i++)Arrays.fill(dp[i], -1);
//         return  f(nums, 0, -1, n, dp);
//     }
// }




// class Solution {    ///TABULATION  CODE
//     public int lengthOfLIS(int[] nums) {
//         int n = nums.length;
//         ///as i have to also consider previous index for comparision so need that start at -1 and will increase it as index increased
//         int dp[][] = new int[n+1][n+1];
//         for(int i = n-1; i>=0; i--){
//             for(int j=i;j>=-1;j--){   ///not i-1 as we did index shifting
//                 int notTake = 0 + dp[i+1][j+1];          ///as j+1 taken just because of index shifting
//                 int take = 0;
//                 if( j == -1 || nums[i] > nums[j]){
//                     take = 1 + dp[i+1][i+1];    ////i+1 of j is taken because of index shifting
//                 }
//                 dp[i][j+1] = Math.max(take, notTake);
//             }
//         }
//         return dp[0][0];
//     }
// }



// class Solution {    ///TABULATION  CODE  WITH OPTIMIZATION
//     public int lengthOfLIS(int[] nums) {
//         int n = nums.length;
//         int current[] = new int[n+1];
//         int ahead[] = new int[n+1];
//         for(int i = n-1; i>=0; i--){
//             for(int j=i;j>=-1;j--){   ///not i-1 as we did index shifting
//                 int notTake = 0 + ahead[j+1];          ///as j+1 taken just because of index shifting
//                 int take = 0;
//                 if( j == -1 || nums[i] > nums[j]){
//                     take = 1 + ahead[i+1];    ////i+1 of j is taken because of index shifting
//                 }
//                 current[j+1] = Math.max(take, notTake);
//             }
//             ahead = current.clone();
//         }
//         return current[0];
//     }
// }




class Solution {    ///simple O(n^2) Approach

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        int maxi =0;
        Arrays.fill(dp, 1);   /////// fill with 1 as we know that 1 is then length of any subsequence
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[j] < nums[i]){
                    dp[i] = Math.max(dp[i],1 +  dp[j]);
                }
            }
            maxi = Math.max(maxi, dp[i]);
        }
        return maxi;
    }
}