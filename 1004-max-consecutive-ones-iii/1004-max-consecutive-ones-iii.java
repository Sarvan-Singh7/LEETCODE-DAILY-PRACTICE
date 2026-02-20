class Solution {  
    public int longestOnes(int[] nums, int k) {
        int maxLength =0;
        int zeroes=0;
        int start=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                zeroes++;
            }
            while(zeroes>k){               
               if(nums[start++] ==0){
                zeroes--;
               }
            }
            maxLength = Math.max(maxLength, i-start+1);
        }
        return maxLength;
    }

}


// class Solution {  //== Brute code But stilll Run Because for Break condition reduce TC
//     public int longestOnes(int[] nums, int k) {
//         int maxlen =0;
//         for(int i=0;i<nums.length;i++){
//             int count=0;
            
//             for(int j=i;j<nums.length;j++){
//                 if(nums[j] == 0 ){ // 0 calculate karte raho
//                     count++;
//                 }
//                 if(count<=k){   //jab tak 0 k se chote so update maxlength
//                     maxlen = Math.max(maxlen, j-i+1);
//                 }
//                 else{break;}  //for optimization it is necccesary because without it some cases not pass longer
//             }
//         }
//         return maxlen;
//     }

// }