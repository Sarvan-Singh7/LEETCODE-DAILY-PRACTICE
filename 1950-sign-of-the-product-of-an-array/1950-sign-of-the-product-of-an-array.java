// class Solution {    Solution 1 but not so OPTIMAL
//     public int arraySign(int[] nums) {
//         int products=1;
//         for(int i=0;i<nums.length;i++){
//                 if(nums[i] >0)nums[i] =1;
//                 else if(nums[i] <0)nums[i] =-1;
//                 if(nums[i] ==0)return 0;
//                 products*=nums[i];
//         }
//         if(products >0)return 1;
//         if(products <0)return -1;
//         if(products ==0)return 0;
//         return 0;
//     }
// }

//OPTIMAL in this we will check if negative numbers are odd counted in an array then it has to return -1

class Solution {    
    public int arraySign(int[] nums) {
        int products=1;
        int negativeCount=0;
        int positiveCount=0;
        for(int i=0;i<nums.length;i++){
               
               if(nums[i] == 0){return 0;}
               if(nums[i] < 0){
                negativeCount++;                  //counting negative number and how many time it present
               }
               else{positiveCount++;}          //counting positive number that how many times it is present
    }
    if(negativeCount%2==0){  //note that if count of negative number is even so final product will be even
        return 1;
    }
    else{                       //else odd
        return -1;
    }
}
}
