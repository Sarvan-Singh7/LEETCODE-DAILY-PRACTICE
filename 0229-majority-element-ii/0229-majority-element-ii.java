
class Solution {
    // Function to find majority elements in an array
    public List<Integer> majorityElement(int[] nums) {    
        int n=nums.length;
        List<Integer> arr = new ArrayList<>();
        int count1=0,count2=0;
        int canditate1=0, canditate2 =0;
        for(int num : nums){
            if(count1 == 0 && num  != canditate2){  ///num != canditate2 is important as see dry run of [2,1,1,3,1,4,5,6]
                count1 = 1;
                canditate1 = num;
            }
            else if(count2 ==0 && num != canditate1){ //also same condition on this line
                count2=1;
                canditate2 = num;
            }
            else if(canditate1 == num){count1++;}
            else if(canditate2 == num){count2++;}
            
            else{
                count1--;
                count2--;
            }
        }
        ///manual check
        count1 = 0;count2=0;  //so that we can again check that is it right
        for(int num : nums){
            if(num == canditate1){
                count1++;
            }
            else if(num == canditate2){
                count2++;
            }
        }
        if(count1 > n/3 )arr.add(canditate1);
        if(count2 > n/3)arr.add(canditate2);
        return arr;
    }
}

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

// class Solution {
//     // Function to find majority elements in an array
//     public List<Integer> majorityElement(int[] nums) {    
//         int n = nums.length;
//         List<Integer> result = new ArrayList<>();
//         Map<Integer, Integer> mpp = new HashMap<>();
//         int mini = n / 3 + 1;

//         for (int i = 0; i < n; i++) {
//             mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);

//             // Add to result only when the count just reaches mini
//             if (mpp.get(nums[i]) == mini) {
//                 result.add(nums[i]);
//             }

//             if (result.size() == 2) break;
//         }

//         return result;
//     }
// }