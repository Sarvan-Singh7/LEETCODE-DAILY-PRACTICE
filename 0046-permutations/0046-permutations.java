class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        Compute(nums,arr, 0);
        return arr;
    }
    public static void Compute(int[] nums, List<List<Integer>> arr, int index){
        if(index == nums.length){
            List<Integer> aux = new ArrayList<>();
            for(int el: nums){
                aux.add(el);
            }
            arr.add(aux);
        }
        for(int i=index;i<nums.length;i++){
            swap(nums,index, i);
            Compute(nums, arr, index+1);
            swap(nums, index, i);
        }
    }
    public static void swap(int nums[], int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}