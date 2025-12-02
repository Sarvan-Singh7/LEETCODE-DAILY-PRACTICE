class MinStack {
Stack<Integer> st = new Stack<>();
Stack<Integer> stMin = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        st.push(val);
        if(stMin.isEmpty() || val <= stMin.peek()){
            stMin.push(val);
        }

    }
    
    public void pop() {
        int topPar = st.pop();
        if(topPar == stMin.peek()){
            
            stMin.pop();
        }
        
        
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return stMin.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */