class Solution {
    public String smallestPalindrome(String s) {
        ////we will sort half portion of an array and then we will make second half portion similar to first half and return new String
        char arr[] = s.toCharArray();
        int n = s.length();
        int partition = n/2;
        Arrays.sort(arr, 0, partition);////give length to sort till mid
        //now copy first half to second half also

        for(int i=0; i<partition; i++){
            arr[n - 1 - i] = arr[i];
        }
        return new String(arr);
    }
}