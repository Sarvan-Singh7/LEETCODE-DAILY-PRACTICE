class Solution {
public:
     int j=0;
    int removeElement(vector<int>& nums, int val) {
        int n=nums.size();
        for(int i=0;i<n;i++){
            if(nums[i]!=val){
                swap(nums[i],nums[j]);
                j++;
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
           
            if(nums[i] == val){
                break;
            } count++;
        }
        return count;
    }
};