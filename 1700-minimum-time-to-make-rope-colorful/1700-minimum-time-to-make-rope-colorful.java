class Solution {
    public int minCost(String colors, int[] neededTime) {
        int totalSum=0;
        int n= colors.length();
        for(int i=0;i<n;){
            int sum=neededTime[i];
            int maxi=neededTime[i];
            int j=i+1;
            while(j<n && colors.charAt(i) == colors.charAt(j)){
                sum+=neededTime[j];
                maxi = Math.max(maxi, neededTime[j]);
                j++;
            }
            if(j-i >1){
                totalSum += (sum - maxi);
            }

            i=j;
        }
        return totalSum;
    }
}