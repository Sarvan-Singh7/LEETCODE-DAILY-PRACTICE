class Solution {
    public int[] dailyTemperatures(int[] temperatures) { //PLAY WITH INDEX SAME PROBLEM AS NEXT GREATER
        int n= temperatures.length;
        Stack<Integer> st = new Stack<>();
        int result[] = new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && temperatures[st.peek()] <= temperatures[i]){// EDGE CASE duplicate may exist so  pop them also in this
                st.pop();
            }
            if(st.isEmpty()){
                result[i] = 0;
            }else{
                result[i] = st.peek() -i;    // as st.peek() contins next greater element's index
            }
            st.push(i);
        }
        return result;
    }
}