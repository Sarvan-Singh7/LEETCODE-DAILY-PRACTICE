class Solution {
    public static int f(ArrayList<Integer> arr, int i, int j, int dp[][]){
        if(i>j) return 0;
        int maxi = Integer.MIN_VALUE;
        if(dp[i][j] != -1)return dp[i][j];
        for(int k=i;k <= j; k++){
            int cost = arr.get(i-1) * arr.get(k) * arr.get(j+1); ////i and j used here check here
            int firstPart = f(arr, i, k-1, dp);
            int secondPart = f(arr, k+1, j, dp);
            int total = cost + firstPart + secondPart;
            maxi = Math.max(maxi, total);
        }
        return dp[i][j] =  maxi;
    }
    public int maxCoins(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        for(int num : nums)arr.add(num);
        arr.add(1);
        int n = arr.size();////size of new arrayList
        int dp[][] = new int[n][n];
        for(int i=0;i<n;i++)Arrays.fill(dp[i], -1);
        return f(arr, 1, arr.size() - 2, dp);  ///as first and last index of arraylist nahin bheja because of prefix and suffix
    }
}