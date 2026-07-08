// class Solution {
//     public int minSubArrayLen(int target, int[] nums) {
//         int mini = Integer.MAX_VALUE;
//         for(int i=0;i<nums.length;i++){
//             int sum =0;
//             for(int j=i;j<nums.length;j++){https://leetcode.com/u/Sarvan-Singh7$0
//                 sum += nums[j];
//                 if(sum >= target){
//                     mini = Math.min(mini, j-i+1);
//                 }
//             }
//         }
//         if(mini == Integer.MAX_VALUE){
//             return 0;
//         }
//         return mini;
//     }
// }
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int mini = Integer.MAX_VALUE;
        int left =0, right =0;
        int sum =0;
        for(right =0; right <n;right++){
            sum = sum + nums[right];
            while(sum >= target){
                mini = Math.min(mini, right - left+1);
                sum -= nums[left++];
            }

        }
        if(mini== Integer.MAX_VALUE)return 0;
        return mini;
    }
}