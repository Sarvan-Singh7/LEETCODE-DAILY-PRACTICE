class Solution {
    static int modulo = (int)1e9+7;
    public int maxSum(int[] nums1, int[] nums2) {
        int i=0, j=0;
        long  sum1=0;        // long   le liya so that error na aye 
        long  sum2 =0;
        long  maxi=0;
        int m = nums1.length, n = nums2.length;
        while(i<m && j<n){
            if(nums1[i] < nums2[j]){
                sum1 += nums1[i];
                i++;
            }
            else if(nums1[i] > nums2[j]){
                sum2 += nums2[j];
                j++;
            }
            else if(nums1[i] == nums2[j]){
                long  helper =( Math.max(sum1, sum2) ) %modulo;
                maxi = maxi + helper;
                maxi = maxi + nums1[i]; ///woh add karna mat bhulna ; 
                sum1=0;
                sum2 =0;
                i++;
                j++;
            }
        }
        while(i<m){
            sum1 += nums1[i];
            i++;
        }
        while(j<n){
            sum2 += nums2[j];
            j++;
        }
        long helper = ( Math.max(sum1, sum2) ) %modulo;
        maxi = ( maxi + helper ) %modulo;

        return (int)maxi % modulo;
    }
}