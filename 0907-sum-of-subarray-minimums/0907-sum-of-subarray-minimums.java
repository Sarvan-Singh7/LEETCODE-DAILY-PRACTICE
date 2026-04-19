class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n= arr.length;
        int mod = (int)1e9 +7;
        int NSE[] = nextSmaller(arr,n);
        int PSE[] = prevSmaller(arr,n);
        long sum =0;
        for(int i=0;i<n;i++){
            int left = i - PSE[i];
            int right = NSE[i] -i;
            long frequency = left * right * 1L;
            long val = (frequency * arr[i])%mod;
            sum = (sum + val)%mod;
        }
        return (int)sum;
    }
    public int[] nextSmaller(int []arr, int n){
        int helper[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[i] <= arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty())helper[i] = n;
            else helper[i] = st.peek();

            st.push(i);
        }
        return helper;
    }
    public int[] prevSmaller(int []arr, int n){
        int helper[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[i] < arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty())helper[i] = -1;
            else helper[i] = st.peek();

            st.push(i);
        }
        return helper;
    }
}



// class Solution {
//     public int sumSubarrayMins(int[] arr) {
//         int n= arr.length;
//         int sum=0;
//         for(int i=0;i<n;i++){
//             int minimum = Integer.MAX_VALUE;
//             for(int j=i;j<n;j++){
//                 minimum = Math.min(minimum, arr[j]);////arrr[j] used , not arr[i];
//                 sum += minimum;     //calculate sum in this inner loop , not in outer loop
//             }
            
//         }
//         return sum;
//     }
// }