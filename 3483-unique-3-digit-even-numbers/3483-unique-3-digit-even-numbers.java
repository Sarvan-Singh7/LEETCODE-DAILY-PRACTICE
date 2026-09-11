class Solution {
    public int totalNumbers(int[] digits) {
        int total =0;
        int freqDigit[] = new int[10];
        for(int i=0; i<digits.length;i++){
            freqDigit[digits[i]]++;////count frequency of all digits in this array
        }
        
        for(int i=100; i<999;i++){
            int val = i;
            boolean allDigitPresent = true;
            int freq[] = new int[10];//to count frequency of loop element
            while(val > 0){
                int ld = val%10;
                freq[ld]++;
                val/=10;
            }
            //to check if that digit count equaly present here in digits array
            for(int d=0; d<10; d++){
                if(freqDigit[d] < freq[d]){///as agaar new val ki frequency jyada hai than what needed so not possible
                   allDigitPresent = false; 
                   break;
                }
            }
            if(allDigitPresent && i %2==0){//also check for even
                total++;
            }
        }
        return total;
    }
}