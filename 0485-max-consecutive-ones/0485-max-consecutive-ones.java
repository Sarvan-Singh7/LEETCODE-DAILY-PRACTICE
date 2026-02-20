// class Solution {
//     public int findMaxConsecutiveOnes(int[] nums) {
//         int n=nums.length;
//         int maxi=Integer.MIN_VALUE;
//         int count=0;
//         for(int i=0;i<n;i++){
//             count++;
//             if(nums[i] ==0){
//                 count=0;
//             }
            
//             maxi=Math.max(maxi,count);
            
//         }
//         return maxi;
//     }
// }


class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int InnerCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] ==0){
                InnerCount=0;
                continue;
            }
            else{
                InnerCount++;
            }
            maxCount = Math.max(InnerCount, maxCount);
        }
        return maxCount;
    }
}



















