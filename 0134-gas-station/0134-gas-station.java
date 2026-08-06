class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int totalGas =0;
        int totalCost = 0;
        for(int i=0;i<n;i++){
            totalGas += gas[i];
            totalCost += cost[i];
        }
        if(totalGas < totalCost)return -1;

        int totalAns =0, startingIndex =0;
        for(int i=0; i<n; i++){
            totalAns += gas[i] - cost[i];

            if(totalAns < 0){
                startingIndex = i+1;
                totalAns = 0;
            }
        }
        return startingIndex;
    }
}