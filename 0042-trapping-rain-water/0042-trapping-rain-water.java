class Solution {///FORMULA = Min(leftMax, rightMax) - arr[i];
    public int trap(int[] height) {/// O(N) TC & SC === O(n)
        int water =0;
        int n = height.length;
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        ///calculating prefix
        prefix[0] = height[0];
        for(int i=1;i<n;i++){
            prefix[i] = Math.max(prefix[i-1], height[i]);
        }  
        ///calculating suffix
        suffix[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            suffix[i] = Math.max(suffix[i+1], height[i]);
        }

        ///Part in which we will compare
        for(int i=0;i<n;i++){
            water += Math.min(prefix[i], suffix[i]) - height[i];
        }
        return water;
    }
}





// class Solution {///FORMULA = Min(leftMax, rightMax) - arr[i];
//     public int trap(int[] height) {///BRUTE FORE O(NSQUARE)
//         int water =0;

//         for(int i=0;i<height.length;i++){
//             int leftMax =0,rightMax =0;
//             for(int j=0;j<=i;j++){
//                 leftMax = Math.max(leftMax, height[j]);
//             }
//             for(int j=i;j<height.length;j++){
//                 rightMax = Math.max(rightMax, height[j]);
//             }
//             water += Math.min(leftMax, rightMax) - height[i];

//         }
//         return water;
        
//     }
// }