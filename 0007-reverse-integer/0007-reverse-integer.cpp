class Solution {
public:
    int reverse(int x) {
        long long n=x;  //can see as they may have largen value than INT_MAX so long long taken
        int count=0;
        long long sum=0;

        if(n<0){
            count=1;
            n=n* -1;
        }

        while(n>0){
            sum=sum*10;
            int ld=n%10;
            sum+=ld;
            
            
            n/=10;
        }
        if(sum<INT_MIN ||sum>INT_MAX) return 0;     //that i only have to make a operation on 32 bit system so enable this condition.
        if(count==0) return sum;
        else return -1*sum;
    }
};