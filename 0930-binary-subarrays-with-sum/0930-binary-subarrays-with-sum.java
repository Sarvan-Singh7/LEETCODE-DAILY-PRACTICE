// class Solution {
//     public int numSubarraysWithSum(int[] nums, int goal) {
//         int count=0;
//         for(int i=0;i<nums.length;i++){
//             int oneCount=0;
//             for(int j=i;j<nums.length;j++){
//                 if(nums[j] == 1){
//                     oneCount++;
                    
//                 }
//                 if(oneCount==goal){
//                         count++;
//                     }
//             }
//         }
//         return count;
//     }
// }
//Approach = if we want to calculate sum =k so calculate([sum greater than equal to k] - [sum greater than k])

class Solution {
    //code to calculate greater than equal to k
    public static int CheckSum(int[] nums, int goal){
        int count=0;
        int left =0;
        int oneCount=0;
        if(goal <0)return 0; /// only less than case valid here (=) gives Error
        for(int right =0;right < nums.length;right++){
            if(nums[right] == 1)oneCount++;
            while(oneCount > goal){
                if(nums[left] ==1)oneCount--;
                left++;
            }
            count = count + (right - left +1); // as we are calculating for numbers greater equal than goal
               
        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        int answer = CheckSum(nums, goal) - CheckSum(nums, goal -1);
        return answer;// upper cheking calling for checking sum 
    }
}