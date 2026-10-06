class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        if(s.length() == 0 || s == null)return 0;
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(ch);
            }
            else{
                if(!st.isEmpty() && st.peek() == '(' ){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
        }
        return st.size();
    }
}