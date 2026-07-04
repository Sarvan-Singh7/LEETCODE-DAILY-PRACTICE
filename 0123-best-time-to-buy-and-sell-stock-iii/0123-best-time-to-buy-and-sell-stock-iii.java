class Solution {
    public static int f(int arr[], int index,int buy,  int cap, int n, int dp[][][]){
        if(cap == 0)return 0;
        if(index == n)return 0;
        if(dp[index][buy][cap] != -1)return dp[index][buy][cap];
        if(buy == 1){
            int take = -arr[index] + f(arr, index+1, 0, cap, n, dp);///changed buy variable to 0 so to sell now and not to reBuy before sell
            int notTake = 0 + f(arr, index+1, 1, cap, n, dp); ////buy variable not changed
            return dp[index][buy][cap] = Math.max(take, notTake);
        }
        else{
            int take = arr[index] + f(arr, index +1, 1, cap -1, n, dp);/// cap variable DECREASES as succes in 1,, buy variabe changed to 1 as we can buy new now
            int notTake = 0 + f(arr, index + 1, 0, cap, n, dp);///buy not changed
            return dp[index][buy][cap] = Math.max(take, notTake);
        }
    }
    public int maxProfit(int[] prices) {
        ///this problem is just one modification of Buy and sell stock 2 
        //we just have to track number of ransaction in this  that limit to 2
        ///we can just do it with a variable [ cap ] , we will start this cap with 2
        //we will decrease cap value on one buy and sell pair
        //then if cap reach to an end then return total profit earned
        int n = prices.length;
        int dp[][][] = new int[n][2][3];   /// cap wala size set to 3 as to cover 0 also in 3d Grid
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                Arrays.fill(dp[i][j], -1);
            }
        }
        return f(prices, 0, 1,2, n, dp);
        //i am passing buy as 1 so that to Buy an item if buy is one and otherwise sell
    }
}