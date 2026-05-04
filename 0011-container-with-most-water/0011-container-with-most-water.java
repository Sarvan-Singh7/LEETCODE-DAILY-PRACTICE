class Solution {
    public int maxArea(int[] height) {
        int maxi = Integer.MIN_VALUE;
        int n = height.length;
        int i=0;int j=n-1;
        while(i<=j){
            int mini = Math.min(height[i], height[j]);
            int ar = j-i;
            maxi = Math.max(ar * mini , maxi);
            if(height[i] <= height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxi;
    }
}