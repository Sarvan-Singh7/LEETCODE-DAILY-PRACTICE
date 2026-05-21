class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        ///store each element Substring in HashSet and then compare to next Array
        HashSet<String> set = new HashSet<>();
        int maxi =0;
        for(int num : arr1){
            String s = Integer.toString(num);
            for(int i=1;i<=s.length();i++){  //started from 1 as we need length as second parameter in substring fn
                set.add(s.substring(0,i));
            }
            
        }
        for(int num : arr2){
            String s = Integer.toString(num);
            for(int i=1;i<=s.length();i++){
                if(set.contains(s.substring(0,i))){
                    maxi = Math.max(maxi, i);
                }
            }
        }
        return maxi;
    }
}