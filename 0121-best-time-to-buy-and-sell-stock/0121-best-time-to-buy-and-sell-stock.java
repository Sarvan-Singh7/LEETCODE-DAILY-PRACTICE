class Solution {
    public int maxProfit(int[] prices) {
        int maxi = 0;
        int maxProfit =0;
        int min= prices[0];
        int n = prices.length;
        if(n ==0)return 0;//as if single element so how to buy and sell
        for(int i=1;i<n;i++){
            min = Math.min(min, prices[i]);
            if(prices[i] - min >=0){
                maxi = Math.max(maxi, prices[i] - min);
            }
        }
        return maxi;
    }
}