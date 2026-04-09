class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        int n= nums.length;
        int m = (1 << n);  //n left shift 1 means that if inut is two so it become 4 etc// also NUMBER OF SUBSET = M
        for(int i=0; i<m;i++){
            ArrayList<Integer> arr = new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i >> j) %2 == 1){
                    arr.add(nums[j]);
                }
            }
            answer.add(arr);
        }
        return answer;
    }
    
}



// class Solution {
//     public List<List<Integer>> subsets(int[] nums) {
//         List<List<Integer>> answer = new ArrayList<>();
//         List<Integer> helper = new ArrayList<>();
//         Calculate(nums, answer,helper, 0);
//         return answer;
//     }
//     public static void Calculate(int nums[], List<List<Integer>> answer,List<Integer> helper, int i){
//         if(i == nums.length){
//             answer.add(new ArrayList<>(helper));   // new ArrayList bhi likhna hoga
//             return;/// return mean ab bactrack karke as upar bhi jaega
//         }
//         //// Include case first
//         helper.add(nums[i]);
//         Calculate(nums, answer, helper, i+1); // helper.add() inside kiya agar so erroer
//         helper.remove(helper.size() -1);      // excluse last elemnt before start exclude for fair
//         Calculate(nums, answer, helper, i+1);

//     }
// }


// class Solution {    == using recursion
//     public List<List<Integer>> subsets(int[] nums) {
//         List<List<Integer>> answer = new ArrayList<>();
//         List<Integer> helper = new ArrayList<>();
//         Calculate(nums, answer, helper, 0);
//         return answer;

//     }
//     public static void Calculate(int []nums,List<List<Integer>> answer ,List<Integer> helper ,int i){
//         if(i == nums.length){
//             answer.add(new ArrayList<>(helper));
//             return;
//         }
//         helper.add(nums[i]);
//         Calculate(nums,answer,helper,i+1);
//         helper.remove(helper.size() -1);
//         Calculate(nums,answer,helper,i+1);
//     }
// }




















