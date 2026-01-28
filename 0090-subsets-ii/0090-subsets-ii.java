class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> helper = new ArrayList<>();
        Calculate(answer, nums,helper,0);
        return answer;
    }
    public static void Calculate(List<List<Integer>> answer, int nums[], List<Integer> helper, int i){
        if(i == nums.length){
            answer.add(new ArrayList<>(helper));
            return;
        }
        // include simply as subset 1 in this
        helper.add(nums[i]);
        Calculate(answer, nums,helper,i+1);
        helper.remove(helper.size() -1);  // remove elemnt to go upward
        //for exclude first left duplicates and in exclude call through new idx
        int idx = i+1;
        while(idx <nums.length && nums[idx] == nums[idx-1]){  // see i use idx only to compare so that i remins same
            idx++;
        }
        //now exclude case
        Calculate(answer, nums,helper,idx);  // not idx+1 needed
        
    }
}