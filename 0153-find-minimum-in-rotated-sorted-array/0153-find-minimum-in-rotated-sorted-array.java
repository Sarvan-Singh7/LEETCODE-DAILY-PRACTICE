// class Solution {
//     public int findMin(int[] nums) {
//         int maxi=Integer.MAX_VALUE;
//         for(int i=0;i<nums.length;i++){  // please do it with binary search
//             maxi = Math.min(nums[i] , maxi);
//         }
//         return maxi;
//     }
// }





class Solution {
    public int findMin(int[] arr) {
        int n= arr.length;
        int st=0;
        int end=n-1;
        int answer = Integer.MAX_VALUE;
        while(st<= end){
          int mid = st + (end  - st )/2;
          if(arr[st] <= arr[end]){
            answer = Math.min(arr[st] , answer);
            break;
          }

          if(arr[mid] <= arr[end]){
              end = mid -1;
              answer = Math.min(arr[mid] , answer);
              
          }
          else{
            answer = Math.min(arr[st] , answer);
            st = mid+1;
          }
        }
        return answer;
    }
}