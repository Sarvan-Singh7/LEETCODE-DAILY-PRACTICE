class Solution {
    public int countOdds(int low, int high) {
        int countKaro=0;
        if(low%2==1 && high%2==1)countKaro = (high - low)/2+1;
        if(low%2==0 && high%2==0)countKaro = (high - low)/2;
        if(low%2==1 && high%2==0)countKaro = (high - low)/2+1;
        if(low%2==0 && high%2==1)countKaro = (high - low)/2+1;

        return countKaro;

    }
}