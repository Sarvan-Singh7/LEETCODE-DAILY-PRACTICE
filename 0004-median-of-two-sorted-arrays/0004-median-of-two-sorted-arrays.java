// class Solution {
//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         int n = nums1.length;
//         int m = nums2.length;
//         int answer[] = new int[n+m];
//         int i =0, j=0;
//         int k =0;
//         while(i<n && j < m){
//             if(nums1[i] <= nums2[j]){
//                 answer[k++] = nums1[i++];
//             }
//             else{
//                 answer[k++] = nums2[j++];
//             }
//         }
//         while(i<n){
//             answer[k++] = nums1[i++];
//         }
//         while(j<m){
//              answer[k++] = nums2[j++];
//         }
//         if(answer.length %2 != 0){
//             int index = 0 + (answer.length - 0)/2;
//             return answer[index];
//         }
//         int index = 0 + (answer.length-1 - 0)/2;
//         double ans = (answer[index] + answer[index+1])/2.0;
//         return ans;
//     }
// }

class Solution {  ///reduced extra space  by 2 Pointer Approach TC = O(m + n)
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int nn = n + m;
        
        // Target index/indices in the merged virtual array
        int idx2 = nn / 2;
        int idx1 = idx2 - 1; // Used if total length is even
        
        int ind1El = -1, ind2El = -1;
        int i = 0, j = 0, count = 0;
        
        // Traverse until we collect up to the required median positions
        while (count <= idx2) {
            int currentVal;
            
            if (i < n && j < m) {
                if (nums1[i] <= nums2[j]) {
                    currentVal = nums1[i++];
                } else {
                    currentVal = nums2[j++];
                }
            } else if (i < n) {
                currentVal = nums1[i++];
            } else {
                currentVal = nums2[j++];
            }
            
            // Record elements at target median positions
            if (count == idx1) ind1El = currentVal;
            if (count == idx2) ind2El = currentVal;
            
            count++;
        }
        
        // If odd, return the exact middle element. If even, return the average.
        if (nn % 2 != 0) {
            return (double) ind2El;
        } else {
            return (ind1El + ind2El) / 2.0;
        }
    }
}
