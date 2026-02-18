class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxlen =0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            
            for(int j=i;j<nums.length;j++){
                if(nums[j] == 0 ){ // 0 calculate karte raho
                    count++;
                }
                if(count<=k){   //jab tak 0 k se chote so update maxlength
                    maxlen = Math.max(maxlen, j-i+1);
                }
                else{break;}
            }
        }
        return maxlen;
    }

}