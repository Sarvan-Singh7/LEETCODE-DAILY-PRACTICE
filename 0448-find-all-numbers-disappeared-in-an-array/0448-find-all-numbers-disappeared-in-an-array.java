class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> arr = new HashSet<>();
        int n= nums.length;
        for(int i=0;i<n;i++){
            arr.add(nums[i]);    //all elements added to arraylist arr
        }
        ArrayList<Integer> arr2 = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(!arr.contains(i)){     //then simple loop from 1 to n will check if really element present using contains function 
                arr2.add(i);           //if not then add to resultant arraylist
            }
        }
        return arr2;
}
}