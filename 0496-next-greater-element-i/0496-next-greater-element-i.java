class Solution {
    public static int find(int nums[], int el){
        int answer = -1;
        int index =-1;
        int greater = -1;
        for(int i=0; i<nums.length;i++){
            if(nums[i] == el){
                index =i;
                greater = nums[i];
                break;
            }
        }
        el = -1;
        if(index == -1)return index;
        for(int i=index+1; i<nums.length;i++){
            if(greater < nums[i]){
                el = nums[i];
                break;
            }
        }
        return el;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int answer[] = new int[n];
        
        for(int i=0; i<n;i++){
            answer[i] = find(nums2, nums1[i]);
        }
        return answer;
    }
}