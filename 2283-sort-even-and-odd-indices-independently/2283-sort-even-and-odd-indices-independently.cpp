class Solution {
public:
    vector<int> sortEvenOdd(vector<int>& nums) {
        int n=nums.size();
        vector<int>odd;
        vector<int>even;
        for(int i=0;i<n;i++){
            if(i%2==0){
                even.push_back(nums[i]);
            }
            else{
                odd.push_back(nums[i]);
            }
        }
        sort(even.begin(),even.end());
        sort(odd.begin(),odd.end(),greater<int>());
        int i=0;
        int j=0;
        for(int k=0;k<n;k++){
            if(k%2==0){
                nums[k]=even[i++];
            }
            else{
                nums[k]=odd[j++];
            }
            
        }
        return nums;
    }
};