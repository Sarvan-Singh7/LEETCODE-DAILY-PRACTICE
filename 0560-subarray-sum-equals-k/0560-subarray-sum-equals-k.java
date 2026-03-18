///SUBARRAY SUM LTE K - SUBARRRAY SUM LT K IS ANSWER
class Solution {
    public int subarraySum(int[] nums, int k) {
        int answer = Check(nums,k) - Check(nums,k-1);
        return answer;
    }
    public static int Check(int[] nums, int k){
        if(k<0)return 0;
        int left =0;
        int count =0;
        int sum =0;
        for(int right =0;right < nums.length;right++){
            sum += nums[right];
            while(sum >k){
                sum -= nums[left];
                left++;
            }
            if(sum <=k){
                count+= (right - left + 1);
            }
        }
        return count;
    }
}