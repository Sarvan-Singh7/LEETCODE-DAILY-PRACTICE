class Solution {
    public static int check(int arr[], int k, int day){
        int n = arr.length;
        int count = 0;
        int totalCount=0;
        for(int i=0;i<n;i++){
            if(arr[i] <= day){
                count++;
                if(count == k){
                    totalCount++; //no need of Math.ceil 
                    count =0;    //set agian to 0 as then correct
                }
            }
            else{
                count = 0;
            }
            
        }
        return totalCount;
    }
    // public int minDays(int[] bloomDay, int m, int k) {   ///TLE asresult in M*N   or quadratic TC
    //     int maxi =0;
    //     int mini = 0;
    //     for(int val : bloomDay){
    //        maxi = Math.max(maxi, val); //maximum element for range 
    //        mini = Math.min(mini, val);
    //     } 
    //     if(m * k >= bloomDay.length)return -1; ////impossible case to make boutique
    //     for(int i=mini; i<= maxi; i++){
    //         if(check(bloomDay , k, i) >= m){
    //             return i;
    //         }
    //     }
    //     return maxi;
    // }

////////////////////////////BINARY SEARCH/////////////////////////////////////
    public int minDays(int[] bloomDay, int m, int k) {
        int maxi =0;
        int mini = Integer.MAX_VALUE;
        for(int val : bloomDay){
           maxi = Math.max(maxi, val); //maximum element for range 
           mini = Math.min(mini, val);
        } 
        if((long)m * k > bloomDay.length)return -1; ////impossible case to make boutique (long karna jaruri)
        
        int i=mini, j = maxi;
        int answer =0;
        while(i<=j){
            int mid = i + (j-i)/2;
            if(check(bloomDay, k, mid) >= m){
                answer = mid;
                j = mid -1;  //search now for more smaller value
            }
            else{
                i = mid +1;
            }
        }
        return answer;
    }
}