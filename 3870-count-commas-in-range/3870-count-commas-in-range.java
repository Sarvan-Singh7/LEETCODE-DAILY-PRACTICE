class Solution {
    public int countCommas(int n) {
        int commas =0;
        if(n<=999)return 0;
        for(int i=1000; i<=n;i++){
            if(i <=9999)commas++;
            else if(i<=99999 && i>9999)commas+=1;
            else if(i<=999999 && i>99999)commas+=1;
        }
        return commas;
    }
}