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


// class Solution{
//   public static int findMin(int []arr) {
//         int si =0,end = arr.length -1;
//         while(si<end){
//             int mid = si +(end - si) /2;
//         if(arr[mid] > arr[end]) si = mid +1;
//         else if(arr[mid] < arr[end]) end = mid;
//         else end--;
//     }
//     return arr[si];
//   }
// }


// 2. The Rule for Rotated Sorted ArraysIf arr[left] <= arr[mid], the left side is sorted. The minimum must be on the right side. You should capture arr[left] and move left = mid + 1.If arr[mid] <= arr[right], the right side is sorted. The minimum must be on the left side (or is arr[mid] itself). You should capture arr[mid] and move right = mid - 1.

class Solution{
  public static int findMin(int []arr) {
        int left =0,right = arr.length -1;
        int mini = arr[0];
        
        while(left <= right){
            int mid = left + (right - left)/2;
            if(arr[left] < arr[right]){
                mini = Math.min(mini, arr[left]);
                break;
            }
            if(arr[left] == arr[mid] && arr[right] == arr[mid]){
                mini = Math.min(mini, arr[left]);
                left++;
                right--; 
            }
            else if(arr[left] <= arr[mid]){ //matlb ki left half sorted so first element is minimum
                mini = Math.min(mini, arr[left]);
                left = mid+1; //store it and then START SEARCH IN RIGHT HALF
            }
            else if(arr[mid] <= arr[mid]){   ///matlab ki right half sorted
                mini = Math.min(mini, arr[mid]);
                right = mid-1;   ///so now search in left half
            }
        }
        return mini;
  }
}




