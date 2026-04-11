class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int n= heights.length;
        int arr[] = new int[n];
        arr[n-1] = 0;//last wala apne right mein kissi ko nahin dekhega
        st.push(heights[n-1]);//also push that element into stack for future loop
        for(int i=n-2;i>=0;i--){
            int count=0;
            while(!st.isEmpty() && heights[i] >= st.peek()){   //NEXT GREATER ELEMENT UPGRADED CODE
                count++;
                st.pop();
            }
            if(st.size() >0)count++;///as us greater wala jo element hai agar stack mein toh hi count increase
            arr[i] = count;
            st.push(heights[i]);
        }
        return arr;
    }
}