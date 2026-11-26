class Solution {
    public boolean canAliceWin(int n) {
        if(n < 10)return false;
        int take = 10;
        int k =0;
        while(n >= take){
            n-= take;
            take--;
            k++;
        }
        return (k%2 == 1);
    }
}