class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int packsSum=0;
        for(int i=0;i<apple.length;i++){
            packsSum+= apple[i];
        }
        int capacitySum=0;
        int total=0;
        for(int i=capacity.length-1;i>=0;i--){
            capacitySum+=capacity[i];
            total++;
            if(capacitySum >= packsSum){
                return total;
            }
        }
        return total;
    }
}