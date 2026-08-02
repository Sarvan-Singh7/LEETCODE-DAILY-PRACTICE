// Math trick: Because n is even and sum is odd, Alice can mathematically guarantee a win by completely controlling the parity (even/odd) of the indices Bob is allowed to pick.
//return true;
/////RETURN TRUE SE BHI PURA CODE CHAL JAEGA AS EVEN NUMBER OF ELEMENTS PRESENT-----------------------------------
class Solution {
    public static int f(int arr[], int si, int ei, int dp[][]){
        if(si > ei)return 0;
        if(dp[si][ei] != -1)return dp[si][ei];
        int left = arr[si] - f(arr, si+1, ei, dp);
        int right = arr[ei] - f(arr, si, ei -1, dp);
        return dp[si][ei] = Math.max(left, right);
    }
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        int dp[][] = new int[n][n];
        for(int i=0; i<n;i++)Arrays.fill(dp[i], -1);
        return f(piles, 0, n-1, dp) >=0?true:false;
    }
}