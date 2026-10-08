class Solution {
    public String removeOuterParentheses(String s) {
        int count =0;
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n;i++){
            char ch = s.charAt(i);
            ///open bracket
            if(ch == '('){
                if(count >0){
                    sb.append(ch);
                    
                }
                count++;
            }
            else{
                count--;
                if(count >0){
                    sb.append(ch);
                
                }
            }
        }
        return sb.toString();
    }
}