class Solution {
    public int countSum(int nums[]){
        int sumSuffix = 0;
        for(int j=0;j<nums.length;j++){
            sumSuffix += nums[j];
        }
        return sumSuffix;
    }
    public int countPartitions(int[] nums) {
        int totalSum = countSum(nums);
        int PrefixSum =0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            PrefixSum += nums[i];
            int suffixSum = totalSum - PrefixSum;
            if(Math.abs(PrefixSum - suffixSum) %2 ==0){
            count++;
             }

        }
        if(count ==0){return 0;}
        return count-1;
        
    }
}