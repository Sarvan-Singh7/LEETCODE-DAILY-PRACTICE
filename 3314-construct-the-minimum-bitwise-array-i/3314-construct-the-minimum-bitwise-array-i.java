class Solution {
    public int check(int n){
        for(int i=0;i<n;i++){
            if((i | i+1) == n){   // use brackets as a necessity
                return i;
            }
        }
        return -1;
    }
    public int[] minBitwiseArray(List<Integer> nums) {
        int arr[] = new int[nums.size()];
        for(int i=0;i<nums.size();i++){
           arr[i] = (check(nums.get(i)));
        }
        return arr;
    }
}