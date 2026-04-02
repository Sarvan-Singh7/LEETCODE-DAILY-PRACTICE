class Solution {
    public boolean isBalanced(String num) {
        int evenDigits = 0;
        int oddDigits = 0;
        for(int i=0;i<num.length();i++){
            int number = num.charAt(i) - '0';
            if(i%2 == 0){
                evenDigits+= number;
            }else{
                oddDigits += number;
            }
        }
        return oddDigits == evenDigits;
    }
}