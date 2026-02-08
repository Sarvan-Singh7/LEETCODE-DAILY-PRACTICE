class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum =0;
        int left=0,right = k-1;
        for(int i=0;i<=right;i++){   //step 1..first calculate first k element sum
            sum += cardPoints[i];
        }
        int maxPoints = sum;        //maximum will be initialized by that first k element sum
//now shrink that first k elementsfrom k-1 value and add new elemnt from last part of array to make k element
        int lastPart =cardPoints.length -1;
        for(int i=right;i>=0;i--){
            sum= sum - cardPoints[i];    // see kth se remove and last part of original array se add;
            sum = sum + cardPoints[lastPart];
            lastPart--;
            maxPoints = Math.max(maxPoints, sum);

        }
        return maxPoints;
    }
}