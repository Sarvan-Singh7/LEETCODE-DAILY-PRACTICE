class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        char s[] =num.toCharArray(); 
        for(int i = 0;i<num.length();i++){
            while(!st.isEmpty() && k >0 && (st.peek() -'0') > (s[i] -'0')){
                st.pop();
                k--;
            }

            st.push(s[i]);
        }
        while(k>0){
            st.pop();
            k--;
        }
        if(st.isEmpty())return "0";
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        //possiility that there are some leading zeroes in stringBuilder
        while(sb.length() > 0 && sb.charAt(sb.length() -1) =='0'){
            sb.deleteCharAt(sb.length() -1);
        }
        if(sb.length() ==0)return "0";
        sb.reverse();
        return sb.toString();


    }
}