class Solution {
public:
    int differenceOfSums(int n, int m) {
        vector<int>divisible; //creating a vector divisible which store numbers that are divisible  by m
        int num1=0,num2=0;
        vector<int>notDiv;   //store those which are not divisible
        for(int i=1;i<=n;i++){
                if(i%m==0){
                    divisible.push_back(i);
                    num1+=i;      //calculating sum of elements which are present in divisible;
                }
                else{
                    notDiv.push_back(i);
                    num2+=i;     //calculating sum which are not divisible
                }
        }
        return num2-num1;  // return difference between num2 and num1
    }
};