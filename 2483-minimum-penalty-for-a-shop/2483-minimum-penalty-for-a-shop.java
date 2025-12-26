class Solution {
    public int bestClosingTime(String arr) {
        int suffixY =0;
        int index = 0;
        for(int i=0;i<arr.length();i++){
            if(arr.charAt(i) == 'Y')
            suffixY+=1;  

        }
        
        int mini= suffixY;
        for(int i=0;i<arr.length();i++){
          
          if(arr.charAt(i) == 'Y'){
            suffixY--;
          }
          else{
            suffixY++;
          }
          if(suffixY < mini){
            mini= suffixY;
            index = i+1;
          }
          
          
        }
        return index;
    }
}
