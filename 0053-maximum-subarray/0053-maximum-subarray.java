// class Solution {
//     public int maxSubArray(int[] nums) {
//         int sum=0;
//         int maxi = Integer.MIN_VALUE;
//         for(int i=0;i<nums.length;i++){
//             sum+=nums[i];
//             maxi = Math.max(sum, maxi);
//             if(sum < 0){
//                 sum=0;
//             }
//         }
//         return maxi;
    
//     }
// }


class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        int start = 0;      // temporary start
        int ansStart = 0;   // final start
        int ansEnd = 0;     // final end

        for (int i = 0; i < nums.length; i++) {

            if (sum == 0) {
                start = i; // possible new subarray
            }

            sum += nums[i];

            if (sum > maxi) {
                maxi = sum;
                ansStart = start;
                ansEnd = i;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        // Printing subarray
        System.out.print("Maximum Subarray: ");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(nums[i] + " ");
        }

        return maxi;
    }
}
