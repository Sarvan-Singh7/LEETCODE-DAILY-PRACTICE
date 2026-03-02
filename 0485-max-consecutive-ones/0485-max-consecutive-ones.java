class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int maxi=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i] == 1){
                count++;
            }
            else{
                
                count=0;
                continue;
            }
            maxi = Math.max(maxi, count);   // ye else part mein calculate kiya so error aya so do AT THIS
        }
        return maxi;
    }
}


// class Solution {
//     public int findMaxConsecutiveOnes(int[] nums) {
//         int maxCount = 0;
//         int InnerCount=0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i] ==0){
//                 InnerCount=0;
//                 continue;
//             }
//             else{    //do not forgot to calculate ones count also
//                 InnerCount++;
//             }
//             maxCount = Math.max(InnerCount, maxCount);
//         }
//         return maxCount;
//     }
// }



















