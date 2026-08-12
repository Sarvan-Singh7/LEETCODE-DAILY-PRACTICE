// class Solution {
//     public int maxSubarrayLength(int[] nums, int k) {
//         int maxLen = 0;
//         int n = nums.length;
//         for(int i=0; i<n; i++){
//             HashMap<Integer, Integer> map = new HashMap<>();
//             boolean flag = false;
//             for(int j=i; j<n;j++){
//                 map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
//                 for(int key : map.keySet()){
//                     if(map.get(key) > k){
//                         flag = true;
//                     }
//                 }
//                 if(flag == false)maxLen = Math.max(maxLen, j-i+1);
//             }
//         }
//         return maxLen;
//     }
// }


class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int maxLen = 0;
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int left =0, right=0;
        for(right=0; right<n; right++){
            map.put(nums[right], map.getOrDefault(nums[right], 0)+ 1);
            boolean flag = false;
            
            while( map.get(nums[right]) > k){
                map.put(nums[left], map.get(nums[left]) - 1);
                if(map.get(nums[left]) == 0)map.remove(nums[left]);
                left++;
            }
            maxLen = Math.max(maxLen, right - left +1);
        }
        return maxLen;
    }
}