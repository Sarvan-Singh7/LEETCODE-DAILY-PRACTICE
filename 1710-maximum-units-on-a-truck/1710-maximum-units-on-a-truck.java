class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b) -> b[1] - a[1]);
        int n = boxTypes.length;
        int answer =0;
        for(int i=0; i < n ;i++){
            if(boxTypes[i][0] <= truckSize){
                answer += (boxTypes[i][1]  * boxTypes[i][0]) ;
                truckSize -= boxTypes[i][0];
            }
            else{
                while(truckSize >=1){
                    answer += boxTypes[i][1];
                    truckSize--;
                }
            }
        }
        return answer;
    }
}