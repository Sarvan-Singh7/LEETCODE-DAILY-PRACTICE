class Solution {
    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] Symbols = {"M", "CM", "D",  "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<values.length; i++){
            if(num == 0)break;

            while(num >= values[i]){ ///while needed here (if) not valid
                sb.append(Symbols[i]);
                num -= values[i];
            }
        }
        return sb.toString();
        
    }
}