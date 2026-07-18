// class Solution {
//     public List<List<Integer>> fourSum(int[] nums, int target) {
//         List<List<Integer>> answer = new ArrayList<>();
//         int n = nums.length;
//         for(int i=0; i<n; i++){
//             for(int j=i+1; j<n; j++){
//                 for(int k=j+1; k<n; k++){
//                     for(int l=k+1; l<n; l++){
//                         int sum = nums[i] + nums[j] + nums[k] + nums[l];
//                         if(sum == target){
//                             ArrayList<Integer> helper = new ArrayList<>();
//                             helper.add(nums[i]); helper.add(nums[j]); helper.add(nums[k]); helper.add(nums[l]);
//                             Collections.sort(helper);
//                             if(!answer.contains(helper)) answer.add(helper);
//                         }
//                      }
//                 }
//             }
//         }
//         return answer;
//     }
// }


class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        if(n<4)return answer;///as not able to form quadrant
        for(int i=0; i<= n-4; i++){
            if(i>0 && nums[i] == nums[i-1])continue;
            for(int j=i+1; j<= n-3; j++){
                if(j>i+1 && nums[j] == nums[j-1])continue;

                int k =j+1, l = n-1;
                while(k < l){
                    long sum = (long)nums[i] + nums[j] + nums[k] + nums[l]; //long ke bina nahin chalega
                    if(sum == target){
                        ArrayList<Integer> helper = new ArrayList<>();
                        helper.add(nums[i]); helper.add(nums[j]); helper.add(nums[k]); helper.add(nums[l]);
                        answer.add(helper);
                        k++;
                        l--;
                        while(k<l && nums[k] == nums[k-1])k++;   //while hi ayega otherwise agar simple if hua so not pass
                        while(k<l && nums[l] == nums[l+1])l--;
                    }
                    else if(sum > target){
                        l--;
                    }
                    else k++;
                }
            }
        }
        return answer;
    }
}