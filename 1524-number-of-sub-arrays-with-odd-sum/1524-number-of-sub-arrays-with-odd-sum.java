class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod = 1000000007;
        int count =0, prefixSum =0;
        int odd_count =0, even_count =1;
        ///as even =0 as sum so 1 in even_count
        for(int num : arr){
            prefixSum += num;
            
            if(prefixSum %2 == 0){
                count += odd_count;
                even_count++;
            }
            else{
                count += even_count;
                odd_count++;
            }
            count = count%mod;
        }
        return count;
    }
}