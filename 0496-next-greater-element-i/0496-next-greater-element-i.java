class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n= nums1.length;
        int n2 = nums2.length;
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++){
             int startPosition=-1;  //first to find start [position example  => when nums1 ka element finded in nums2]
             int PutInArr = -1;   //element to put into array
             for(int j=0;j<n2;j++){
                if(nums1[i] == nums2[j]){
                    startPosition =j;
                    break;
                }
             }
            
             for(int k = startPosition +1 ;k<n2 ; k++){
                if(nums1[i] < nums2[k]){
                    PutInArr = nums2[k];
                    
                    break;
                }
             }
             arr[i] = PutInArr;
             
        }
        return arr;
    }
}