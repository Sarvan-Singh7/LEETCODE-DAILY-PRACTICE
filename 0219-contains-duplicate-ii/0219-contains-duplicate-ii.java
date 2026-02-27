// class Solution {
//     public boolean containsNearbyDuplicate(int[] nums, int k) {////BRUTE
//         for(int i=0;i< nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i] == nums[j]  && Math.abs(i-j) <=k){
//                     return true;
//                 }
//             }
//         }
//         return false;
        
//     }
// }
// //OPTIMAL
// 1. STORE EACH ELEMENT IN  A MAP WHILE ITERATING
// 2. NOW TO FIND SAME ELEMET AGAIN SO AS WE KNOW THAT VALUE OF MAP CONTAINNS INDEX SO JUST FIND THAT IF PRESENT
// 2. NOW IF CONDITION TRUE SO RETURN IT
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {/// OPTIMAL USING MAP
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey (nums[i])){
                int prevIndex = map.get(nums[i]);
                if(Math.abs(prevIndex -i) <= k){
                    return true;
                }
            }

            map.put(nums[i], i);
        }
        return false;
        
    }
}