class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int n= happiness.length;
        long sum=0;
        int check = 0;
        for(int i=n-1;i>=0 && check <k;i--){
            int curr = happiness[i] - check;
            if(curr <0){
                break;
            }
            sum+=curr;
            check++;
        }
        return sum;
        }
        
    }
