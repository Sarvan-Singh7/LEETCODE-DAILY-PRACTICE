class Solution {
    public static int f(int arr[], int i, int dp[]){
        if(i == arr.length)return 0;
        if(dp[i] != -1)return dp[i];
        int left =0;
        int maxi = Integer.MIN_VALUE;
        for(int j=i; j<i+3 && j< arr.length; j++){
            left = left + arr[j];
            int currentTaken = left - f(arr, j+1,dp);
            maxi = Math.max(maxi, currentTaken);
           
        }
        return dp[i] = maxi;
    }
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        int ans = f(stoneValue, 0, dp);
        if( ans> 0){
            return "Alice";
        } 
        else if(ans < 0){
            return "Bob";
        }
        return "Tie";
    }
}