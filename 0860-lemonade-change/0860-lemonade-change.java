class Solution {
    public boolean lemonadeChange(int[] bills) {
      
        int five=0, tens=0, twenty =0;
        for(int i=0; i<bills.length; i++){
            int val = bills[i];
            if(val == 5)five++;
            else if(val == 10){
                if(five == 0)return false;
                tens++;
                five--;
            }
            else if(val == 20){
                if((five >= 3) || (five >=1 && tens >=1) ){
                    twenty++;
                    
                    if((five >=1 && tens >=1)){///pehle tens wale nikal diya as it only used in 20 wala case then 3 five ka karo
                        five--;
                        tens--;
                    }
                    else if(five >= 3)five = five-3;
                    
                }else{
                        return false;
                    }
                
            }
        }
        return true;
    }
}