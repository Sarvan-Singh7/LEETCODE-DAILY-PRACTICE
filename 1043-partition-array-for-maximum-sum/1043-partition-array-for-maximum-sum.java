// class Solution {    ///MEMOIZATION CODE
//     public static int f(int arr[], int k, int i, int dp[]){
//         int n = arr.length;
//         if(i == n)return 0;
//         int maxi =0;
//         int length = 0;
//         int sum =0;
//         if(dp[i] != -1)return dp[i];
//         for(int j=i; j< Math.min(k+i, n); j++){//Math.min so for last elements it goes till n
//             length++;
//             maxi = Math.max(maxi, arr[j]);
//             int currentSum =  (maxi * length) + f(arr, k, j+1, dp);  ////as it calculates maximum till j so start from j+1;
//             sum = Math.max(currentSum, sum);
//         }
//         return dp[i] = sum;
//     }
//     public int maxSumAfterPartitioning(int[] arr, int k) {
//         int n = arr.length;
//         int dp[] = new int[n];
//         Arrays.fill(dp, -1);
//         return f(arr, k, 0, dp);
//     }
// }


class Solution {////////////////////////tabulation CODE;/////////////////////////////////
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int dp[] = new int[n+1];  //size increased
        dp[n] = 0;

        for(int i=n-1; i>=0; i--){
            int maxi =0;   //////al these variables shall be inside outer loop and need to set to 0 when needed
            int length = 0;
            int sum =0;
            for(int j=i; j< Math.min(k+i, n); j++){//Math.min so for last elements it goes till n
                length++;
                maxi = Math.max(maxi, arr[j]);
                int currentSum =  (maxi * length) + dp[j+1];  ////as it calculates maximum till j so start from j+1;
                sum = Math.max(currentSum, sum);
            }
            dp[i] = sum;
        }
        return dp[0];
    }
}