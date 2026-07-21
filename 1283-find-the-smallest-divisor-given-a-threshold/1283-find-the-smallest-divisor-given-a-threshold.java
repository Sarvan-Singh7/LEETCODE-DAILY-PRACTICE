// class Solution {   ///gives TLE as O(maxi * n)  nearby quad
//     public static int check(int nums[], int divisor){
//         int totalSum=0;
//         for(int i=0; i<nums.length; i++){
//             int val = nums[i];
//             totalSum += Math.ceil((double)val/divisor);  //need double as in java by default Integer Division is possible
//         }
//         return totalSum;
//     }
//     public int smallestDivisor(int[] nums, int threshold) {
//         int n = nums.length;
//         int maxi = 0;
//         for(int i=0;i<n; i++){
//             maxi = Math.max(maxi, nums[i]); //at maxi all divided at 1 so answer will be arraylength can be possible but we want minimum so there is below loop
//         }
//         for(int i=1; i<= maxi; i++){
//             if(check(nums, i) <= threshold){
//                 return i;
//             }
//         }
//         return maxi;
//     }
// }

class Solution {     ////BS code O(n * log(maxi) )
    public static int check(int nums[], int divisor){
        int totalSum=0;
        for(int i=0; i<nums.length; i++){
            int val = nums[i];
            totalSum += Math.ceil((double)val/divisor);  //need double as in java by default Integer Division is possible
        }
        return totalSum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int maxi = 0;
        for(int i=0;i<n; i++){
            maxi = Math.max(maxi, nums[i]); //at maxi all divided at 1 so answer will be arraylength can be possible but we want minimum so there is below loop
        }
        int i=0, j=maxi;   ///j= maxi (not n-1)
        int answer =0;
        while(i<=j){
            int mid = i + (j-i)/2;
            if(check(nums, mid) <= threshold){
                answer = mid;
                j = mid -1; ////search in left now 
            }
            else{
                i = mid +1;///search in greater value if on smaleer not exists
            }
        }
        return answer;  ///as calculated above
    }
}