class Solution {
    public int search(int[] arr, int target) {
        int st=0;
      int end = arr.length -1;
      while(st<=end){
          int mid = st + (end - st) /2;
          if(arr[mid] == target){
              return mid;
          }
          else if(arr[mid] <= arr[end]){    // if right part is sorted
              if(arr[mid] <= target && arr[end] >=target){   //sorted mein check that array target element is range mein aa raha hai kya
                  st = mid +1;
              }
              else{
                  end = mid-1;    //agar nahin toh search on unsortd half
              }
          }
          else{                             //if left part is sorted
              if(arr[mid] >=target && arr[st] <= target){
                  end=mid-1;
              }
              else{
                  st = mid+1;
              }
          }
          
      }
      return -1;
    }
}