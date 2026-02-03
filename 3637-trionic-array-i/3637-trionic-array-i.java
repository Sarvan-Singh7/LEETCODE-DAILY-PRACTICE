class Solution {
    public boolean isTrionic(int[] nums) {
        int i=0;
        int n= nums.length;
        while(i+1 <n && nums[i] < nums[i+1]){
            i++;
        }
        if(i==0 || i== n-1)return false;
        while(i+1 <n && nums[i] > nums[i+1]){
            i++;
        }
        if(i==0 || i== n-1)return false;
        while(i+1 <n && nums[i] < nums[i+1]){
            i++;
        }
        if( i== n-1)return true;
       
      return false;
    }
}