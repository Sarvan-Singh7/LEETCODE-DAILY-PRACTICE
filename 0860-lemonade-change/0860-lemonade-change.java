class Solution {  ///har ek lemonade 5 deolliar ka hai and people ke pass 5, 10, 20 ke notes hai and maine dekhna hai ki apne change se kya mai
//sab logon ko lemonade de sakta hun and unke baki paise wapas bhi if yes so return true

    public boolean lemonadeChange(int[] bills) {
        int five =0, ten =0;
        for(int i=0;i<bills.length;i++){
            if(bills[i] == 5){
                five++;
            }
            else if(bills[i] == 10){
                if(five >=1){
                    ten = ten+1;  //also update 10 as it came
                    five = five -1;  ///10 diye customer ne so agar mere pass 5 pade hai toh hi complete hoga nahin toh false
                }
                else return false;
            }
            else if(bills[i] == 20){
                if(ten !=0 && five !=0){  ////as 2 ways to return 15 back to customer means(10 + 5) Or (5+5+5);
                    ten--;
                    five--;
                }
                else if(five >=3){
                    five = five -3;
                }
                else {
                    return false;
                }
            }
        }
        return true;   // all elements satisfied
    }
}