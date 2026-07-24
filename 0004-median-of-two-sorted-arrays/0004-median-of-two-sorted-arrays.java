class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int answer[] = new int[n+m];
        int i =0, j=0;
        int k =0;
        while(i<n && j < m){
            if(nums1[i] <= nums2[j]){
                answer[k++] = nums1[i++];
            }
            else{
                answer[k++] = nums2[j++];
            }
        }
        while(i<n){
            answer[k++] = nums1[i++];
        }
        while(j<m){
             answer[k++] = nums2[j++];
        }
        if(answer.length %2 != 0){
            int index = 0 + (answer.length - 0)/2;
            return answer[index];
        }
        int index = 0 + (answer.length-1 - 0)/2;
        double ans = (answer[index] + answer[index+1])/2.0;
        return ans;
    }
}