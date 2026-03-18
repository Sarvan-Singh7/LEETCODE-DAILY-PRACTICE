// class Solution {
//     public List<Integer> majorityElement(int[] nums) {
//         int n = nums.length;
//         ArrayList<Integer> arr = new ArrayList<>();
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             map.put(nums[i], map.getOrDefault(nums[i],0)+1);
//              if(map.get(nums[i]) >n/3){
//                 if(!arr.contains(nums[i])){   ///check kar lo ki woh pehle se arraylist mein present na ho 
//                     arr.add(nums[i]);
//                 }
                
//             }
//         }
//         for(int key : map.keySet()){
           
//         }
//         return arr;
//     }
// }


class Solution {
    // Function to find majority elements in an array
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> mpp = new HashMap<>();
        int mini = n / 3 + 1;

        for (int i = 0; i < n; i++) {
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);

            // Add to result only when the count just reaches mini
            if (mpp.get(nums[i]) == mini) {
                result.add(nums[i]);
            }

            if (result.size() == 2) break;
        }

        return result;
    }
}