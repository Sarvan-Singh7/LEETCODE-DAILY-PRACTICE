class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> helper = new ArrayList<>();
        Calculate(nums, answer,helper, 0);
        return answer;
    }
    public static void Calculate(int nums[], List<List<Integer>> answer,List<Integer> helper, int i){
        if(i == nums.length){
            answer.add(new ArrayList<>(helper));
            return;/// return mean ab bactrack karke as upar bhi jaega
        }
        //// Include case first
        helper.add(nums[i]);
        Calculate(nums, answer, helper, i+1); // helper.add() inside kiya agar so erroer
        helper.remove(helper.size() -1);      // excluse last elemnt before start exclude for fair
        Calculate(nums, answer, helper, i+1);

    }
}