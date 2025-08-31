class Solution {
public:
    int differenceOfSums(int n, int m) {
        
        int num1=0,num2=0;
        
        for(int i=1;i<=n;i++){
                if(i%m==0){
                    num1+=i;      //calculating sum of elements which are present in divisible;
                }
                else{
                    num2+=i;     //calculating sum which are not divisible
                }
        }
        return num2-num1;  // return difference between num2 and num1
    }
};