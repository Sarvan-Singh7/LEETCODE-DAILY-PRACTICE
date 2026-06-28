class Solution {
    public int f(int[] nums, int target2, int index){
        if(index < 0){
            if(target2 == 0)return 1;
            else return 0;
        }
        int notPick =0;
        notPick = f(nums,target2, index -1);
        int pick =0;
        if(target2 >= nums[index])pick=  f(nums, target2 - nums[index], index -1);
        return pick + notPick;
    }
    public int findTargetSumWays(int[] nums, int target) {
        int totalSum =0;
        for(int i=0;i<nums.length;i++){
            totalSum += nums[i];
        }
        int target2 = (totalSum - target)/2;
        if(target2 > totalSum || (totalSum - target) %2 !=0)return 0;
        return f(nums, target2, nums.length -1);
    }
}