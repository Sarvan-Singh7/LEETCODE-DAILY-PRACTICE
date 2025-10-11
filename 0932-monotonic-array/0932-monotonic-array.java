class Solution {
    public boolean isMonotonic(int[] nums) {
        int n=nums.length;
        int inc=0,dec=0;
        for(int i=0;i<n-1;i++){
            if(nums[i] < nums[i+1]){
                inc =1;
                continue;
            }
            else if(nums[i]>nums[i+1]){
                dec=1;
                continue;
            }
        }
        if(inc==1 && dec==1){
            return false;
        }
        if((inc ==1 && dec==0 )|| (inc==0 && dec==1)){
            return true;
        }
        return true;   ///////this is a edge case so at this point return true because it is for consition where all elements are same example 1,1,1,1,1 so has to return true on it
    }
}