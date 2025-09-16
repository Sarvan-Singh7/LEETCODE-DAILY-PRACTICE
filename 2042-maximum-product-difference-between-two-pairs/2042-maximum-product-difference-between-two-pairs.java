class Solution {
    public int maxProductDifference(int[] nums) {
        int n= nums.length;
        int maxi=Integer.MIN_VALUE;
        int smaxi=Integer.MIN_VALUE;

        int smini=Integer.MAX_VALUE;
        int mini=Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++){
            if(nums[i] > maxi){
                smaxi=maxi;
                maxi=nums[i];
            }
            else if(nums[i] >smaxi){
               smaxi=nums[i];
            }


            if(nums[i] < mini){
                smini=mini;
                mini=nums[i];
            }
            else if(nums[i] <smini){
               smini=nums[i];
            }
        }

        return ((maxi * smaxi ) - (mini * smini) );


    }
}