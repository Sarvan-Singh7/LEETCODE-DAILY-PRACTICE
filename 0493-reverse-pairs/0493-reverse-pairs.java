class Solution {
    public int reversePairs(int[] nums) {
        int si =0;
        int ei = nums.length -1;
        int count = mergeSort(nums, si, ei);
        return count;
    }
    public int mergeSort(int[] arr, int si, int ei){
        int count=0;
        if(si<ei){
            int mid = si+(ei-si)/2;
            count += mergeSort(arr, si, mid);
            count += mergeSort(arr, mid+1, ei);
            count += CalculatePairs(arr, si, mid, ei);
            count += MergeIt(arr,si,mid, ei);
        }
        return count;
    }
    public int CalculatePairs(int arr[], int si, int mid, int ei){
        int count=0;
        int i=0,j=mid+1;
        for(i=si;i<=mid;i++){
            while(j<= ei && (long)arr[i] > (long)2* arr[j]){
                j++;
            }
            count+=j-(mid+1);
        }
        return count;
    }
    public int MergeIt(int[] arr, int si, int mid, int ei){
        int i=si,j=mid+1,k=0,count=0;
        int mergedArray[] = new int[ei - si+1];
        while(i<= mid && j<= ei){
            if(arr[i] <= arr[j]){
                mergedArray[k++] = arr[i++];
            }
            else if(arr[j] < arr[i]){ // not  <= used as lesser to find
                
                mergedArray[k++] = arr[j++];
                
            }
        }
        while(i<= mid){  // this and below while loop to calculate when either i or j is reached to its end
           mergedArray[k++] = arr[i++];
        }
        while(j<= ei){
            mergedArray[k++] = arr[j++];
        }
        //putting back those subarray to original array;
        for(int l=0;l<mergedArray.length;l++){  // cannot use arr.length as it is static but mergedArray length is variable  for each call
            arr[si+ l] = mergedArray[l];  // start by si +i as si can be changed on each call

        }
        return count;

    }
}