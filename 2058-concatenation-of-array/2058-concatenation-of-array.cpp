class Solution {
public:
    vector<int> getConcatenation(vector<int>& nums) {
        int n=nums.size();
        vector<int> answer(2*n,1);
        for(int i=0;i<n;i++){
           answer[i]=nums[i];
           answer[n+i] =nums[i];
        }
        return answer;
    }
};