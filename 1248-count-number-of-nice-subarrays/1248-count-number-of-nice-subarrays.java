// class Solution {//////O(N^2)
//     public int numberOfSubarrays(int[] nums, int k) {
//         int count =0;
//         for(int i=0;i<nums.length;i++){
//             int oddCount =0;
//             for(int j=i;j<nums.length;j++){
//                   if(nums[j] % 2 !=0)oddCount++;
//                   if(oddCount == k)count++;
//             }
//         }
//         return count;
//     }
// }

class Solution {
    public static int Check(int[] nums, int k){
          int oddCount =0;
          int count =0;
          int left =0;
          count=0;
          for(int right =0;right < nums.length;right++){
            if(nums[right] % 2 !=0)oddCount++;
            
            while(oddCount >k){ //niche dekho do not minus nums[left]but subtract 1 as decrease Count
                if(nums[left] %2 !=0){
                    oddCount = oddCount -1;
                };
                left++;
            }
            
            count = count+ (right - left +1);
          }
          return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
          int answer = Check(nums, k) - Check(nums, k-1);
          return answer;
}
}
