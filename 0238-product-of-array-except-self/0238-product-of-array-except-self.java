class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int[] prefixProductStart = new int[n];
        int[] prefixProductEnd = new int[n];
        int[] answer = new int[n];
        prefixProductStart[0] = nums[0];
        prefixProductEnd[n-1] = nums[n-1];
        for(int i=1;i<n;i++){
            prefixProductStart[i] = prefixProductStart[i-1] * nums[i];
        }
        
        for(int i=n-2;i>=0;i--){
            prefixProductEnd[i] = prefixProductEnd[i+1] * nums[i];
        }
        answer[0] = prefixProductEnd[1];          //ye hi yahan par hi 2 loops ke noche hi rakhna
        answer[n-1] = prefixProductStart[n-2];
        for(int i=1;i<n-1;i++){
            answer[i] = prefixProductStart[i-1] * prefixProductEnd[i+1];
        }
        return answer;
    }
}