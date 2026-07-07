///code ASKED IN VARIOUS Companies

// class Solution {///BRUTE FORCE GIVES TLE
//     public long maximumSubarraySum(int[] nums, int k) {
//         int n = nums.length;
//         long maxi = 0;
//         for(int i=0;i<n-k+1;i++){
//             long sum =0;
//             HashSet<Integer> set = new HashSet<>();
//             boolean check = false;
//             for(int j=i; j<i+k;j++){
//                 if(set.contains(nums[j])){
//                     check = true;
//                     break;
                    
//                 }
//                 set.add(nums[j]);
//                 sum += nums[j];
//             }
//             if(!check){
//                 maxi = Math.max(maxi, sum);
//             }
//         }
//         return maxi;
//     }
// }


class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long maxi = 0;
        HashSet<Integer> set = new HashSet<>();
        int left = 0;
        int right = 0;
        long sum=0;
        for(right =0;right <n;right++){
            sum += nums[right];
            while(set.contains(nums[right])){
                sum -=nums[left];
                set.remove(nums[left]);
                left++;
            }
            set.add(nums[right]);
            if(right - left +1 == k){
                maxi = Math.max(sum, maxi);
                sum -= nums[left];
                set.remove(nums[left]);
                left++;
            }
            
        }
        return maxi;
    }
}