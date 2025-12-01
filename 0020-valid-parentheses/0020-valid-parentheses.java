class Solution {
    public boolean isValid(String s) {
         char[] ch = s.toCharArray();
         if(ch.length %2 !=0)return false;
         Stack<Character> st = new Stack<>();
         for(int i=0;i<ch.length;i++){
            if(ch[i] =='(' || ch[i] == '[' || ch[i] == '{'){
                st.push(ch[i]);
            }
            else{
                if(st.size()==0) return false;
                if((st.peek() == '(' && ch[i] == ')') || (st.peek() == '[' && ch[i] == ']') || (st.peek() == '{' && ch[i] == '}')){
                    st.pop();
                } 
                
                else{
                    return false;
                }
            }
         }
         if(st.size()>0){return false;}
         return true;
    }
}