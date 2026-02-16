class Solution {
    public static void Solve(int[] nums, List<List<Integer>> answer, List<Integer> helper, boolean freq[]){
        if(helper.size() == nums.length){
            answer.add(new ArrayList<>(helper)); // insert using new Arraylist otherwisw it remains empty
            return;
        }
        //now recursive call if freq value is false
        for(int i=0;i<nums.length;i++){
            if(freq[i] == false){  // afar false matlab ki woh element choose nahin kiya gaya
                helper.add(nums[i]);   //so add it to helper
                freq[i] = true;        //now mark as true so that not to take choosen element
                Solve(nums, answer, helper, freq);  //this call will go to next line when helper size full
                helper.remove(helper.size() -1);   //then return upside so remove last element
                freq[i] = false;     //also mark freq[i] = false for removed element so that to take again
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> helper = new ArrayList<>();
        boolean freq[] = new boolean[nums.length];
        Solve(nums, answer, helper, freq);
        return answer;
    }
}




// class Solution {   ==== OPTIMAL CODE IN TERMS OF SC
//     public List<List<Integer>> permute(int[] nums) {
//         List<List<Integer>> arr = new ArrayList<>();
//         Compute(nums,arr, 0);
//         return arr;
//     }
//     public static void Compute(int[] nums, List<List<Integer>> arr, int index){
//         if(index == nums.length){
//             List<Integer> aux = new ArrayList<>();
//             for(int el: nums){
//                 aux.add(el);
//             }
//             arr.add(aux);
//         }
//         for(int i=index;i<nums.length;i++){
//             swap(nums,index, i);
//             Compute(nums, arr, index+1);
//             swap(nums, index, i);
//         }
//     }
//     public static void swap(int nums[], int a, int b){
//         int temp = nums[a];
//         nums[a] = nums[b];
//         nums[b] = temp;
//     }
// }
