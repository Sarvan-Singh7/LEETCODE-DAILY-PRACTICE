/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
       int st=1,end=n;
       int ans=1;
       while(st<=end){
        int mid=st + (end-st)/2;
        if(isBadVersion(mid)){
            ans=mid;
            end=mid-1;
        }
        else{
            st=mid+1;
        }
       }
       return ans;
    }
}