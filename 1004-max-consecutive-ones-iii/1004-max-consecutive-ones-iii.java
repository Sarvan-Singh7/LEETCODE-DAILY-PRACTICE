class Solution {    ///Most Optimal
    public int longestOnes(int[] nums, int k) {
          int zeroes =0;
          int maxLength =0;
          int left =0;
          for(int right=0;right<nums.length;right++){
            if(nums[right] == 0)zeroes++;
            if(zeroes > k){
                if(nums[left] ==0){
                    zeroes--;
                }
                left++;
            }
            else{
                maxLength = Math.max(maxLength, right-left+1);
            }

          }
          return maxLength;
    }
}





// class Solution {    //Optimal
//     public int longestOnes(int[] nums, int k) {
//         int maxLength =0;
//         int zeroes=0;
//         int start=0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i] == 0){  //calculate zeroes everytime
//                 zeroes++;
//             }
//             while(zeroes>k){    //loop and decrease zeroes till it not come under control             
//                if(nums[start] ==0){ //as start =0 at initial so increment it also so to calculate right length
//                 zeroes--;
//                }
//                start++;
//             }
//             maxLength = Math.max(maxLength, i-start+1);
//         }
//         return maxLength;
//     }

// }


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