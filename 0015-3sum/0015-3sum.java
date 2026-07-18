// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         List<List<Integer>> arr = new ArrayList<>();
//         int n = nums.length;
//         for(int i=0;i<n;i++){
            
//             for(int j=i+1;j<n;j++){
//                 for(int k=j+1;k<n;k++){
//                     if(nums[i] + nums[j] + nums[k] == 0){
//                         List<Integer> helper = new ArrayList<>();
//                         helper.add(nums[i]);helper.add(nums[j]);helper.add(nums[k]);
//                         Collections.sort(helper);
//                         if(!arr.contains(helper)) arr.add(helper);
//                     }
//                 }
//             }
//         }
//         return arr;
//     }
// }




class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i <= n -2;i++){    //end is n-2 as we will also acces some indices like k+1
            if( i>0 && nums[i] == nums[i-1] ){
                continue;
            }
            int j=i+1;
            int k = n-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    ArrayList<Integer> helper = new ArrayList<>();
                    helper.add(nums[i]); helper.add(nums[j]); helper.add(nums[k]);
                    arr.add(helper);
                    j++;
                    k--;
                    while(nums[j] == nums[j-1] && j<k) j++;
                    while(nums[k] == nums[k+1] && j< k)k--;
                }
                else if (sum <0) j++;
                else if(sum > 0)k--;
            }

        }
        return arr;
       
    }
}