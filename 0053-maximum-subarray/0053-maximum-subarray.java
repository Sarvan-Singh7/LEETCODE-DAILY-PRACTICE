/////OPTIMAL AND BEST KADANE ALGORITHM

class Solution {
    public int maxSubArray(int[] nums) {
        int sum =0;
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            maxi = Math.max(maxi, sum);
            if(sum <0){
                sum =0;
            }
            
        }
        return maxi;
    }
}



// class Solution {
//     public int maxSubArray(int[] nums) {
        
//         int maxi = Integer.MIN_VALUE;
//         for(int i=0;i<nums.length;i++){
//             int sum=0;
//             for(int j=i;j<nums.length;j++){   // do start it from i (not from i+1)
//                 sum+= nums[j];
//                 maxi = Math.max(sum, maxi);
//             }
//         }
//         return maxi;
//     }
// }

//    ///// niche wala code also works but it also return us with subarray elements with max sum;   // practice also niche wala
// class Solution {
//     public int maxSubArray(int[] nums) {
//         int sum = 0;
//         int maxi = Integer.MIN_VALUE;

//         int start = 0;      // temporary start
//         int ansStart = 0;   // final start
//         int ansEnd = 0;     // final end

//         for (int i = 0; i < nums.length; i++) {

//             if (sum == 0) {
//                 start = i; // possible new subarray starting position as jab 0 toh new subarray calculation starts
//             }

//             sum += nums[i];

//             if (sum > maxi) {
//                 maxi = sum;
//                 ansStart = start;   // starting position again defined here
//                 ansEnd = i;       // ending position of a subarray    as whenever maximum value ka threshold break
//             }

//             if (sum < 0) {
//                 sum = 0;
//             }
//         }

//         // Printing subarray
//         System.out.print("Maximum Subarray: ");
//         for (int i = ansStart; i <= ansEnd; i++) {
//             System.out.print(nums[i] + " ");
//         }

//         return maxi;
//     }
// }
