

// class Solution {        
//     public int subarraySum(int[] nums, int k) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        int count =0;
//        int prefixSum =0;
//        map.put(0,1);///means zero ki frequency bhi store ki hai
//        for(int i=0;i<nums.length;i++){
//           prefixSum += nums[i];
//           int remove = prefixSum -k;
//           if(map.containsKey(remove)){
//             count += map.get(remove);
//           }
//           map.put(prefixSum, map.getOrDefault(prefixSum, 0) +1);
//        }

//        return count;
//     }
    
// }

class Solution {        
    public int subarraySum(int[] nums, int k) {
       int count =0;
       for(int i=0;i<nums.length;i++){
        int sum =0;
        for(int j=i;j<nums.length;j++){
            sum+=nums[j];
            if(sum == k)count++;
        }
       }
       return count;
    }
    
}


















// ///SUBARRAY SUM LTE K - SUBARRRAY SUM LT K IS ANSWER
// class Solution {         /////NOT VALID APPROACH AS IT IS ONL VALID FOR POSITIVE NUMBERS   SO AS WHEN [-1, -1, -1] AND K=0 SO RETURN 6 BUT HAS TO RETURN 0    ::::::::NOT VALID
//     public int subarraySum(int[] nums, int k) {
//         int answer = Check(nums,k) - Check(nums,k-1);
//         return answer;
//     }
//     public static int Check(int[] nums, int k){
//         if(k<0)return 0;
//         int left =0;
//         int count =0;
//         int sum =0;
//         for(int right =0;right < nums.length;right++){
//             sum += nums[right];
//             while(sum >k){
//                 sum -= nums[left];
//                 left++;
//             }
//             if(sum <=k){
//                 count+= (right - left + 1);
//             }
//         }
//         return count;
//     }
// }