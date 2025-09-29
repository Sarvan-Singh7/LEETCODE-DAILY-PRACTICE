// class Solution {
//     public int findMin(int[] nums) {
//         int maxi=Integer.MAX_VALUE;
//         for(int i=0;i<nums.length;i++){  // please do it with binary search
//             maxi = Math.min(nums[i] , maxi);
//         }
//         return maxi;
//     }
// }

class Solution{
  public static int findMin(int []arr) {
        int si =0,end = arr.length -1;
        while(si<end){
            int mid = si +(end - si) /2;
        if(arr[mid] > arr[end]) si = mid +1;
        else if(arr[mid] < arr[end]) end = mid;
        else end--;
    }
    return arr[si];
  }
}



// class Solution {
//     public int findMin(int[] arr) {
//         int n= arr.length;
//         int st=0;
//         int end=n-1;
//         int answer = Integer.MAX_VALUE;
//         while(st<= end){
//           int mid = st + (end  - st )/2;
//           if(arr[st] <= arr[end]){
//             answer = Math.min(arr[st] , answer);
//             break;
//           }

//           if(arr[mid] <= arr[end]){
              
//               answer = Math.min(arr[mid] , answer);
//               end = mid -1;
//           }
//           else{
//             answer = Math.min(arr[st] , answer);
//             st = mid+1;
//           }
//         }
//         return answer;
//     }
// }