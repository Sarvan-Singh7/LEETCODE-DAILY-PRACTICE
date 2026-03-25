// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int n=nums.length;
//         int [] arr=new int[2];
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){   // ye dekho ki j=i se shuru nahin kiya so that not same index adds up to result so start from i+1
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


///Optimal Solution in one pass  //NATURALLY HANDLES DUPLICATES
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int n=nums.length;
//         int arr[] = new int[2];
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for(int i=0;i<n;i++){
//             if(map.containsKey(target - nums[i])){
//                 arr[0] = map.get(target -nums[i]);
//                 arr[1] = i;
//                 return arr;
//             }
//             map.put(nums[i], i);
//         }
//         return nums;
//     }
// }

//solution using Sorting   needs us to first tore all elements in hanshmap with indices in one loop 
// then SORT ALL ELEMENTS AS ALSO WE PRESERVED INDICES IN A HASHMAP SO USE IT to return via 2 pointers

////below provided solution is with 2 pass
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


// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int n=nums.length;
//         int arr[] = new int[2];
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for(int i=0;i<n;i++){
//              /// AGAR map.put(nums[i], i);  YAHAN LIKHA SO ERROR
//             if(map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i){
//                 arr[0] = i;
//                 arr[1] = map.get(target - nums[i]);
//                 return arr;
//             }
//             map.put(nums[i], i);
//         }
//         return arr;
//     }
// }




////DO IN ONE PASS ONLY
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = new int[2];
        for(int i=0;i<nums.length;i++){
           if(map.containsKey(target - nums[i])){
                arr[0] = i;
                arr[1] = map.get(target- nums[i]);
                return arr;
           }
            map.put(nums[i], i);
        }
        return arr;
    }
}


