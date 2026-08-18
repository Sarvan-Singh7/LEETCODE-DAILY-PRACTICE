class Solution {
    public int largestInteger(int[] nums, int k) {
        ///3 cases when k ==n and when k ==1 and when i<k<n
        int n = nums.length;
        //when k==n so calculate max in fll array
        int maxi = -1;
        
        if(k ==n){   //one subarray
          for(int i=0; i<n;i++){
            maxi = Math.max(maxi, nums[i]);
            }  
         return maxi;
        };
        //count frequency of every element
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        ///if k==1 so it means kis ki frquency 1 woh return karna as n subarrays 
        if(k==1){
            for(int key : map.keySet()){
                if(map.get(key)==1){
                    maxi = Math.max(maxi, key);
                }
            }
            return maxi;
        }

        //if k bich wali range se so it measn ya toh first element ya toh last element answer hoga as it is possibility to take it in only 1 subarray so maximum of both is answer

        if(map.get(nums[0]) ==1){//agar ek baar hi aya pure array mein
            maxi = Math.max(nums[0], maxi);
        }
        if(map.get(nums[n-1]) == 1){//agar last element unique hao toh hi lo
            maxi = Math.max(maxi, nums[n-1]);
        }
        return maxi;
    }
}