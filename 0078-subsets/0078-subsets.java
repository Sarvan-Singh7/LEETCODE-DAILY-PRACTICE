class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> helper = new ArrayList<>();
         Calculate(answer, nums,helper, 0);
        return answer;
    }
    public static void Calculate(List<List<Integer>>answer, int nums[],List<Integer> helper, int si){
        if(si == nums.length){
            answer.add(new ArrayList<>(helper));
            return;
        }
        int Adder = nums[si];
        
        Calculate(answer,nums, helper, si+1);
        helper.add(Adder);      // added in between agar upar kiya so not true
        Calculate(answer, nums, helper, si+1);
        helper.remove(helper.size() -1);   // removing it is mandate so that not append helper array
    }
}