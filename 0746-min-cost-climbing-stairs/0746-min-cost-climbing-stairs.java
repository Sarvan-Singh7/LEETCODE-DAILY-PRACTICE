class Solution {
    public int minCostClimbingStairs(int[] cost) {
        return Math.min(f(cost , 0), f(cost, 1));
       // o se ya 1 se start
    }
    public static int f(int cost[], int i){
        if(i == cost.length)return 0;
        int first = Integer.MAX_VALUE;
        if(i<= cost.length - 1){
            first = cost[i] + f(cost, i+1);
        }
        int second = Integer.MAX_VALUE;
        if(i<= cost.length - 2){
            second = cost[i] + f(cost, i+2);
        }
        return Math.min(first, second);
    }
}