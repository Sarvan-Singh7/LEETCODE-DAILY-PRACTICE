class Solution {      ///please make largestRectangleArea function in one pass
    public int maximalRectangle(char[][] matrix) {
        int maxArea = 0;
        int n= matrix.length, m= matrix[0].length;
        int hist[] = new int[m];  //make its size equals colum length as varies for each row
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] != '0')hist[j] +=1;  //we increase its height if element is one
                else hist[j] =0;
            }
            int area = largestRectangleArea(hist);
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }

  //O(n) solution but not in single pass
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
            if(st.isEmpty())arr[i] = n; //yahan par -1 ki jagah n aya hai as because if not nextSmaller so n ko banalo for correct minus
            else arr[i] = st.peek();

            st.push(i);
        }
        return arr;
    }

}