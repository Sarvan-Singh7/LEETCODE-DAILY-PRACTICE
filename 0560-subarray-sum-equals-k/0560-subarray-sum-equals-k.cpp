class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int n=nums.size(),count=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int end=i;end<n;end++){
                sum+=nums[end];
                if(sum==k){count++;}
            }
            
        }
        return count;
    }
};