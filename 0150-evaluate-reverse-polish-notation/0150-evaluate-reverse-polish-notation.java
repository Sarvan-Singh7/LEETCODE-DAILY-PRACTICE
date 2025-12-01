class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int a,b;
        for(int i=0;i<tokens.length;i++){
            String t = tokens[i];
            if(t.equals("+")){
                b=st.pop();
                a= st.pop();
                st.push(a+b);
            }
            else if(t.equals("-")){
                b=st.pop();
                a=st.pop();
                st.push(a-b);
            }
            else if(t.equals("*")){
                b=st.pop();
                a=st.pop();
                st.push(a*b);
            }
            else if(t.equals("/")){
                b=st.pop();
                a=st.pop();
                st.push(a/b);
            }
            else{    //har baar integer mein convert karke stack mein push karo
               int answer = Integer.parseInt(t);
               st.push(answer);
            }
        }
        return st.pop();
    }
}