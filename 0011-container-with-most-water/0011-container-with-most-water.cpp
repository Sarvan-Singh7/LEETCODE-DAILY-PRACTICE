class Solution {
public:
    int maxArea(vector<int>& height) {
        int n=height.size();
       int mini=0,maxi=INT_MIN,a=0;
        int i=0,j=n-1;
        while(i<j){
            mini=min(height[i],height[j]);
            a=j-i;
            maxi=max(maxi,a*mini);
            a=0;
            if(height[i]<height[j]){
                i++;
            }
            else{j--;}
        }
        return maxi;
    }
};