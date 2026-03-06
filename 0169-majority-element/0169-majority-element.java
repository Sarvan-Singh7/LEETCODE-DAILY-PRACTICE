// class Solution {      ////BRUTE HAI SIR
//     public int majorityElement(int[] nums) {
//         int maxCount=0;
//         int answer =nums[0];
//         for(int i=0;i<nums.length;i++){
//             int count=1;
//             for(int j=i+1; j<nums.length;j++){
//                 if(nums[i] == nums[j]){
//                     count++;
//                 }
//                 if(count > nums.length/2){
//                     answer = nums[i];
//                 }
//             }
//         }
//         return answer;
//     }
// }


class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        for(int key : map.keySet()){
            if(map.get(key) > nums.length/2){
                return key;
            }
        }
        return -1;
}
}