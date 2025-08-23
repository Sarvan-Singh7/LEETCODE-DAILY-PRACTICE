class Solution {
public:
    vector<int> shuffle(vector<int>& nums, int n) {
        int m=nums.size();
    vector<int> arr;
        for(int i=0;i<n;i++){
            arr.push_back(nums[i]);
            arr.push_back(nums[n+i]);

        }
        return arr;
    }
};