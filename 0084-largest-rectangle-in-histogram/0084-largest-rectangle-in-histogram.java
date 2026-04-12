class Solution {
    public int largestRectangleArea(int[] heights) {
        int n= heights.length;
        int prevSmaller[] = prevSmaller(heights, n);
        int nextSmaller[] = nextSmaller(heights, n);
        int maxArea = 0;
        for(int i=0;i<n;i++){
            int width = nextSmaller[i] - prevSmaller[i] -1;
            int area = width * heights[i];
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
    public int[] prevSmaller(int []heights, int n){
        int arr[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty())arr[i] = -1;
            else arr[i] = st.peek();
            
            st.push(i);
        }
        return arr;
    }
    public int[] nextSmaller(int []heights, int n){
        int arr[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty())arr[i] = n; //yahan par -1 ki jagah n aya hai
            else arr[i] = st.peek();

            st.push(i);
        }
        return arr;
    }
}

// class Solution {   //extreme Brute O(n Square)
//     public int largestRectangleArea(int[] heights) {
//         int n= heights.length;
//         int maxArea = Integer.MIN_VALUE;
//         for(int i=0;i<heights.length;i++){
//             int minHeight = heights[i];
//             for(int j=i;j<n;j++){
//                 minHeight = Math.min(minHeight, heights[j]);
//                 int area = minHeight * (j-i+1);
//                 maxArea = Math.max(maxArea, area);
//             }
//         }
//         return maxArea;
//     }
// }