class Solution {
    public int BinarySearch(int[] nums,int n,int target,boolean flag){
        int st=0,end=n-1;
        
        int index=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(nums[mid] == target){
                index=mid;
                if(flag==true){end=mid-1;}
                else if(flag == false){st=mid+1;}
            }
            else if(nums[mid] < target){
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return index;
    }
    public int[] searchRange(int[] nums, int target) {
        int []arr= new int[2];
        int n=nums.length;
        
        int left=BinarySearch(nums,n,target,true);
        int right = BinarySearch(nums,n,target,false);
        arr[0] = left;
        arr[1] = right;
        return arr;
    }
}