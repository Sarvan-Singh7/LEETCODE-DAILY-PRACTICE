// class Solution {                /////this is BRUTE and below this BRUTE you will find OPTIMIZED
//     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//         int n= nums1.length;
//         int n2 = nums2.length;
//         int arr[] = new int[n];
        
//         for(int i=0;i<n;i++){
//             int startPosition=-1;  //first to find start [position example  => when nums1 ka element finded in nums2]
//             int PutInArr = -1;   //element to put into array
//              for(int j=0;j<n2;j++){
//                 if(nums1[i] == nums2[j]){
//                     startPosition =j;
//                     break;
//                 }
//              }
            
//              for(int k = startPosition +1 ;k<n2 ; k++){
//                 if(nums1[i] < nums2[k]){
//                     PutInArr = nums2[k];
                    
//                     break;
//                 }
//              }
//              arr[i] = PutInArr;
             
//         }
//         return arr;
//     }
// }
// Idea

// Traverse nums2

// Maintain a monotonic decreasing stack

// When current element is greater than stack top:

// Pop

// Map popped element → current element (its NGE)

// For remaining stack elements → NGE = -1

// Build answer for nums1 using map
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[] = new int[nums1.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<nums2.length;i++){
           while(!st.isEmpty() && st.peek() < nums2[i]){
               map.put(st.pop(),nums2[i]);
           }

            st.push(nums2[i]);
        }
        while(!st.isEmpty()){
            map.put(st.pop() , -1);
        }
        for(int i=0;i<nums1.length;i++){
            arr[i] = map.get(nums1[i]);
        

    }
    return arr;
    }

}