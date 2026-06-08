class Solution {
    public int climbStairs(int n) {
        //Memoization solution 
        int arr[] = new int[n+1];
        Arrays.fill(arr, -1);
        return helper(n, arr);

    }
    public static int helper(int n , int arr[]){
        if(n<=2)return n;
        if(arr[n] != -1)return arr[n];
        return arr[n] = helper(n-1, arr) + helper(n-2 , arr);
    }
}