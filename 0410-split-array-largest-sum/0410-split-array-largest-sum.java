class Solution { //same as Book Allocation code done on CodeChef
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int maxi = 0;
        int sum = 0;
        for(int i=0;i<n;i++){
            maxi = Math.max(maxi, nums[i]);
            sum += nums[i];
        }
////Hum har baar ek number bhej kar check kar rahein hai ki is number mein sare fill ho jayein 
        // for(int i = maxi; i<= sum; i++){  ///ye O(n * (sum - maxi))  GIVES TLE
        //     if(isPossible(nums, i, k ) <= k){
        //         return i;
        //     }
        // }

        //////////////////Binary Search Logic//////////////////
        int i = maxi, j = sum;
        int answer = 0;
        while(i<=j){
            int mid = i + (j-i)/2;
            if(isPossible(nums, mid, k) <= k){
                answer = mid;
                j = mid -1;
            }
            else{
                i = mid +1;
            }
        }
        return answer;

    }
    public static int isPossible(int nums[], int values,int k){
        int n = nums.length;
        int kCount =0;
        int elementTaken = 1;
        for(int i=0;i<n; i++){
            if(kCount + nums[i] <= values){
               kCount = kCount + nums[i];  //ye teh karega ki ek partion of k kitna jyada weight hold kar sakta hai as at max values tak
            }
            else{
                elementTaken++;
                kCount = nums[i];
            }
        }
        return elementTaken;
    }
}