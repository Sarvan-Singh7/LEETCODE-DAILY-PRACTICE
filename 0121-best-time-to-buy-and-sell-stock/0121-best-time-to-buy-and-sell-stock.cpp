class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int n=prices.size();
        int a=0,maxi;
        int mini=prices[0];
        if(n==1)return 0;
        for(int i=1;i<n;i++){
            mini=min(mini,prices[i]);
            a=prices[i] - mini;
            maxi=max(maxi,a);

        }
        if(maxi>0){
            return maxi;
        }
       return 0; 
    }
    
};