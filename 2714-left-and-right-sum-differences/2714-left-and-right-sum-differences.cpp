class Solution {
public:
    vector<int> leftRightDifference(vector<int>& nums) {
        int n=nums.size();
        vector<int>leftSum(n,0);
        vector<int>rightSum(n,0);
        int sum1=0;
        int sum2=0;
        //calculating left sum (Prefix)
        for(int i=0;i<n;i++){
            leftSum[i]=sum1;
            sum1+=nums[i];
        }
        //calculatin Right Sum(Suffix)
        for(int i=n-1;i>=0;i--){
            rightSum[i]=sum2;
            sum2+=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=abs(leftSum[i] -  rightSum[i]);
        }
        return nums;
    }
};