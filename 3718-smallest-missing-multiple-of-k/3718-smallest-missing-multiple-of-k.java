class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int el : nums)set.add(el);
        for(int i=0; i<=201;i++){
            if(i%k==0 && i>=1){
                if(!set.contains(i)){
                    return i;

                }
            }
        }
        return 0;
    }
}