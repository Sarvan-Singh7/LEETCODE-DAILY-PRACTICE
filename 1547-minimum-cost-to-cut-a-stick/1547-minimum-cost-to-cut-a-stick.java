class Solution {
    public static int f(ArrayList<Integer> arr, int i, int j, int dp[][]){
        if(i>j)return 0;
        int mini = Integer.MAX_VALUE;
        if(dp[i][j] != -1)return dp[i][j];

        for(int k=i; k<= j;k++){
            ///dono ka difference lena hai as lenght needed (not take its addition)
            int cost = arr.get(j+1) - arr.get(i-1);///dyhan se dekho as puri length of current partition ke liye
            int firstPart = f(arr, i, k-1, dp);
            int secondPart = f(arr, k+1, j, dp);
            int total = cost + firstPart + secondPart;
            mini = Math.min(mini,total);
        }
        return dp[i][j]  = mini;
    }
    public int minCost(int n, int[] cuts) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);   ///as length starts from 0
        for(int c : cuts)arr.add(c);
        arr.add(n);   ///as length n given hai jahan tak ja sakte hain
        Collections.sort(arr);

        int dp[][] = new int[arr.size()][arr.size()];
        for(int i=0;i<arr.size();i++)Arrays.fill(dp[i], -1);

        return f(arr, 1, arr.size() - 2, dp);///1 means cuts wale array ka 0th index ka Element and third parameter is cuts ka last index wala element
    }
}