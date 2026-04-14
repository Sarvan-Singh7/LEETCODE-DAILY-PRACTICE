class Solution {
    public int rob(int[] nums) {  //as in House RObber1 code we did use when last element was not connected to first
        int n= nums.length;
        if(n==1)return nums[0];
        int skipFirstHouse[] = new int[n];
        int skipLastHouse[] = new int[n];
        for(int i=0;i< n-1 ; i++){     ///not going to last index
            skipFirstHouse[i] = nums[i+1];
            skipLastHouse[i] = nums[i];
        }
        int sum1 = HelperRob(skipLastHouse);
        int sum2 = HelperRob(skipFirstHouse);
        return Math.max(sum1, sum2);
    }

    public int HelperRob(int arr[]){///Helper Function
        int n= arr.length;
        int prev1 = arr[0];
        int prev2 = Math.max(arr[0], arr[1]);

        for(int i=2;i<n;i++){
            int current = Math.max(arr[i]+ prev1 , prev2);
            prev1 = prev2;
            prev2 = current;
        }
        return prev2;
    }
}//in this example last is connected to first so we will make two arrays 
//array 1 = which contains not last house and array 2 does not contain first house so then maximum of both houses will be returned.