class Solution {///FORMULA = Min(leftMax, rightMax) - arr[i];
    public int trap(int[] height) {/// O(N) TC & SC === O(1)
        int water =0;
        int n = height.length;
        int leftMax=0, rightMax =0, left =0, right = n-1;
        while(left <= right){
            if(height[left] <= height[right]){  ///agar left main smaller so left mein karo kaam
                if(height[left] < leftMax){   //agar leftMax bada hai toh we can store water on current element
                    water += leftMax - height[left];
                }else{
                    leftMax = height[left];    //agar leftMax chotta so just update leftMax as element cannot hold water
                }
                left = left+1;
            }
            else{
                if(height[right] < rightMax){     ///agar yahan rightMax bada hai toh rightMax - height[right] can givr ansewer
                    water += rightMax - height[right];
                }else{
                    rightMax = height[right];
                }
                right = right -1;///never forgot to update
            }
        }
        return water;
    }
}


// class Solution {///FORMULA = Min(leftMax, rightMax) - arr[i];
//     public int trap(int[] height) {/// O(3N) TC & SC === O(2n)
//         int water =0;
//         int n = height.length;
//         int prefix[] = new int[n];
//         int suffix[] = new int[n];
//         ///calculating prefix
//         prefix[0] = height[0];
//         for(int i=1;i<n;i++){
//             prefix[i] = Math.max(prefix[i-1], height[i]);
//         }  
//         ///calculating suffix
//         suffix[n-1] = height[n-1];
//         for(int i=n-2;i>=0;i--){
//             suffix[i] = Math.max(suffix[i+1], height[i]);
//         }

//         ///Part in which we will compare
//         for(int i=0;i<n;i++){
//             if(height[i] < prefix[i] && height[i] < suffix[i]){
//                 water += Math.min(prefix[i], suffix[i]) - height[i];
//             }
            
//         }
//         return water;
//     }
// }





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