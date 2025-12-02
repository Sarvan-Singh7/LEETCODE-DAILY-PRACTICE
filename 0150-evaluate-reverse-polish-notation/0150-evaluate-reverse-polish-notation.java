// class Solution {
//     public int evalRPN(String[] tokens) {
//         Stack<Integer> st = new Stack<>();
//         int a,b;
//         for(int i=0;i<tokens.length;i++){
//             String t = tokens[i];          //store in String for easy reference
//             if(t.equals("+")){            //as s[i] will not work in case of strings
//                 b=st.pop();
//                 a= st.pop();
//                 st.push(a+b);
//             }
//             else if(t.equals("-")){
//                 b=st.pop();
//                 a=st.pop();
//                 st.push(a-b);
//             }
//             else if(t.equals("*")){
//                 b=st.pop();
//                 a=st.pop();
//                 st.push(a*b);
//             }
//             else if(t.equals("/")){
//                 b=st.pop();
//                 a=st.pop();
//                 st.push(a/b);
//             }
//             else{    //har baar integer mein convert karke stack mein push karo
//                int answer = Integer.parseInt(t);
//                st.push(answer);
//             }
//         }
//         return st.pop();
//     }
// }


/////Another Method


class Solution {
    public boolean isNumber(String s){
        if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") ){
            return false;
        }
        return true;
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String s : tokens){
            if(isNumber(s)){
                st.push(Integer.parseInt(s));
            }
            else{
                int x = st.pop();
                int y = st.pop();
                if(s.equals("+") ){
                    st.push(y + x);
                }
                if(s.equals("-") ){st.push(y-x);}
                if(s.equals("*") ){st.push(y*x);}
                if(s.equals("/") ){st.push(y/x);}
            }
        }
        return st.pop();
    }
}