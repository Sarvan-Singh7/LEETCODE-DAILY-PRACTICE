// class Solution {
//     public int findMin(int[] nums) {
//         int maxi = Integer.MAX_VALUE;
//         for(int i=0;i<nums.length;i++){
//              if(nums[i]<maxi){
//                 maxi=nums[i];
//              }
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



