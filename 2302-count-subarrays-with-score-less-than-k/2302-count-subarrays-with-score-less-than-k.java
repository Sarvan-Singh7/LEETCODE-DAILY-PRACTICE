// class Solution {
//     public long countSubarrays(int[] nums, long k) {
//         int n = nums.length;
//         long count =0;
//         for(int i=0;i<n;i++){
//             int sum =0;
//             for(int j =i; j<n;j++){
//                 sum += nums[j];
//                 int len = j-i+1;
//                 if(sum * (len) < k)count++;
//                 else if(sum * (len) >= k)break;   ///without this condition it wont work
//             }
//         }
//         return count;
//     }
// }



class Solution {
    public long countSubarrays(int[] nums, long k) {
        int n = nums.length;
        long count =0;
        long sum =0;
        int right =0, left =0;
        for(right = 0; right <n; right++){
            sum += nums[right];
            while( sum * (right - left +1) >= k){
                sum -= nums[left];
                left++;
            }
            long res = sum * (right - left +1);
            if (res < k )count = count + (right - left +1);
        }
        return count;
    }
}