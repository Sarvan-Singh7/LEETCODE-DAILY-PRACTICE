// class Solution {    ////MEMOIZATION CODE
//     public static int f(int arr[], int index,int buy,  int cap, int n, int dp[][][]){
//         if(cap == 0)return 0;
//         if(index == n)return 0;
//         if(dp[index][buy][cap] != -1)return dp[index][buy][cap];
//         if(buy == 1){
//             int take = -arr[index] + f(arr, index+1, 0, cap, n, dp);///changed buy variable to 0 so to sell now and not to reBuy before sell
//             int notTake = 0 + f(arr, index+1, 1, cap, n, dp); ////buy variable not changed
//             return dp[index][buy][cap] = Math.max(take, notTake);
//         }
//         else{
//             int take = arr[index] + f(arr, index +1, 1, cap -1, n, dp);/// cap variable DECREASES as succes in 1,, buy variabe changed to 1 as we can buy new now
//             int notTake = 0 + f(arr, index + 1, 0, cap, n, dp);///buy not changed
//             return dp[index][buy][cap] = Math.max(take, notTake);
//         }
//     }
//     public int maxProfit(int[] prices) {
//         ///this problem is just one modification of Buy and sell stock 2 
//         //we just have to track number of ransaction in this  that limit to 2
//         ///we can just do it with a variable [ cap ] , we will start this cap with 2
//         //we will decrease cap value on one buy and sell pair
//         //then if cap reach to an end then return total profit earned
//         int n = prices.length;
//         int dp[][][] = new int[n][2][3];   /// cap wala size set to 3 as to cover 0 also in 3d Grid
//         for(int i=0;i<n;i++){
//             for(int j=0;j<2;j++){
//                 Arrays.fill(dp[i][j], -1);
//             }
//         }
//         return f(prices, 0, 1,2, n, dp);
//         //i am passing buy as 1 so that to Buy an item if buy is one and otherwise sell
//     }
// }






// class Solution {    ////TABULATION  CODE
//     public int maxProfit(int[] prices) {

//         int n = prices.length;
//         int dp[][][] = new int[n+1][2][3];   /// cap wala size set to 3 as to cover 0 also in 3d Grid
        
//         ///AS IN MEMOIZATION I- O TO N-1 SO OPPOSITE HERE
//         //AS IN RECURSION BUY = 1 TO 0 SO O TO 1 HERE
//         //AS IN RECURSION CAP = 2 TO 0  SO O TO 2 HERE

//         ///No need to handle base cases as by default all zeroes in array
//         for(int index=n-1; index>=0;index--){
//             for(int buy = 0; buy <=1; buy++){
//                 for(int cap = 1; cap <=2;cap++){  //start cap from 1 as cap 0 toh base case mein hi covered
//                     if(buy == 1){
//                         dp[index][buy][cap] = Math.max((-prices[index] + dp[index+1][0][cap]), (0+ dp[index+1][1][cap])) ;
//                     }
//                     else{
//                         dp[index][buy][cap] = Math.max((prices[index] + dp[index+1][1][cap -1]), (0+ dp[index+1][0][cap])) ;
                    
//                     }
//                 }
//             }
//         }
//         return dp[0][1][2]; //1 as buy last wala remaining toh karenge hi
//     }
// }



class Solution {    ////TABULATION  CODE with space optimization
    public int maxProfit(int[] prices) {

        int n = prices.length;
        int ahead[][] = new int[2][3];   
        int current[][] = new int[2][3];

        for(int index=n-1; index>=0;index--){
            for(int buy = 0; buy <=1; buy++){
                for(int cap = 1; cap <=2;cap++){  //start cap from 1 as cap 0 toh base case mein hi covered
                    if(buy == 1){
                        current[buy][cap] = Math.max((-prices[index] + ahead[0][cap]), (0+ ahead[1][cap])) ;
                    }
                    else{
                        current[buy][cap] = Math.max((prices[index] + ahead[1][cap -1]), (0+ ahead[0][cap])) ;
                    
                    }
                }
            }
             // Deep copy current into ahead before next index iteration
            for(int b = 0; b <= 1; b++) {
                for(int c = 0; c <= 2; c++) {
                    ahead[b][c] = current[b][c];
                }
            }
        }
        return current[1][2]; //1 as buy last wala remaining toh karenge hi
    }
}