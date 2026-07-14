class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;

        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return true;
            }
            //as Contains Duplicate so need to make condition when left right and mid elements are same then to move which one as  no one is answer because agar aswer hota toh upar hi aa jata
            else if(nums[left] == nums[mid] && nums[mid] == nums[right]){
                left++;
                right--;  //so just reduce both as sare same hai
            }
            else if(nums[mid] <= nums[right]){  ///right part sorted
                if(nums[mid] <= target && nums[right] >= target){
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }
            }
            else if( nums[mid] >= nums[left]){
                if(nums[mid] >= target && nums[left] <= target){
                    right = mid-1;
                }
                else{
                    left = mid+1;;
                }
            }
        }
        return false;
    }
}