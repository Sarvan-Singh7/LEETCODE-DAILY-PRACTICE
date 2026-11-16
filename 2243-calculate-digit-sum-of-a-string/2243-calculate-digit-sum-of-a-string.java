class Solution {
    public String digitSum(String s, int k) {
        
        int n = s.length();
        while(s.length() >k){
            StringBuilder sb = new StringBuilder();
           for(int i=0; i<s.length();i=i+k){
            int sum = 0;
            for(int j=i; j<Math.min(i+k , s.length()); j++){///go till Math.min instead of using &&
                sum += s.charAt(j) - '0';
                
            }
            
            sb.append(sum);
          }
          s = sb.toString();
          if(s.length() <=k)return s; 
        }
       return s; ////return s instead of less then k s also return
    }
}