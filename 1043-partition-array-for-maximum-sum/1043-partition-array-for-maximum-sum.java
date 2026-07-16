class Solution {
    public static int f(int arr[], int k, int i, int dp[]){
        int n = arr.length;
        if(i == n)return 0;
        int maxi =0;
        int length = 0;
        int sum =0;
        if(dp[i] != -1)return dp[i];
        for(int j=i; j< Math.min(k+i, n); j++){//Math.min so for last elements it goes till n
            length++;
            maxi = Math.max(maxi, arr[j]);
            int currentSum =  (maxi * length) + f(arr, k, j+1, dp);  ////as it calculates maximum till j so start from j+1;
            sum = Math.max(currentSum, sum);
        }
        return dp[i] = sum;
    }
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        return f(arr, k, 0, dp);
    }
}