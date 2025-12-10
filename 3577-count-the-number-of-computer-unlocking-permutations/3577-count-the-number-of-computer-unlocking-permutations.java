class Solution {
    public int countPermutations(int[] complexity) {
        int modulo = 1000000007;
        int first = complexity[0];
        int count =0;
        for(int i=1;i<complexity.length;i++){
            if(complexity[i] <= first){
                return count;
            }
        }
        long fact=1;
        for(int i=1;i<complexity.length;i++){
            fact =((long)(fact  * i))%modulo;
        }
        return (int)fact;
    }
}