class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int arr[] = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        int n=nums.length;
        
        for(int i= 2 * n-1;i>=0;i--){    //in this question there is circular array so i take double size to iterate
            
            while(!st.isEmpty() && st.peek() <= nums[i%n]){    //but in all condition i take only tilll n-1 as % used
                st.pop();
            }
            if(i<n){     //o that greter than (n-1 ) would not be acceptable
                if(st.isEmpty()){
                arr[i%n] = -1;     //used modulo
                 }
                else{
                arr[i%n] =st.peek();    //used modulo
                 }
            }
            
            st.push(nums[i%n]);
        }
        return arr;
    }
}