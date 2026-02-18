// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int n=nums.length;
//         int [] arr=new int[2];
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(nums[i] + nums[j] == target){
//                     arr[0] = i;
//                     arr[1] = j;
//                     return arr;
//                 }
//             }
//         }
//         return arr;
//     }
// }


///Optimal Solution in one pass
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int arr[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(target - nums[i])){
                arr[0] = map.get(target -nums[i]);
                arr[1] = i;
                return arr;
            }
            map.put(nums[i], i);
        }
        return nums;
    }
}

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int n=nums.length;
//         int [] arr = new int[2];
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             map.put(nums[i], i);
//         }
//         for(int i=0;i<n;i++){
//             if(map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i){
//                 arr[0] = i;
//                 arr[1] = map.get(target - nums[i]);
//                 return arr;
//             }
//         }
//         return arr;
//     }
// }