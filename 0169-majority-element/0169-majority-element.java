class Solution {      ////MOST OPTIMAL MOORE VOTING ALGORITHM
    public int majorityElement(int[] nums) {
        int count =0;
        int answer = nums[0];
        for(int i=0;i<nums.length;i++){
            if(count ==0){
                count =1;
                answer = nums[i];
            } //for starting as well as when all cancell out
            else if(nums[i] == answer)count++;  //increase count when find same to reach upper condition with help of cancellation with below one
            else count--;    //help in making count =0 for selection of new element
        }
        return answer;
    }
}



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


// class Solution {    ///SOLUTION USING HASHMAP
//     public int majorityElement(int[] nums) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             map.put(nums[i], map.getOrDefault(nums[i], 0)+1);   //pehle add kiya and baad mein check kiya hai
//             if(map.get(nums[i]) > nums.length/2){
//                 return nums[i];
//             }
//         }
        
//         return -1;
// }
// }