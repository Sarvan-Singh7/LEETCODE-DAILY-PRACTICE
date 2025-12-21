class Solution {
    public int[] asteroidCollision(int[] arr) {// SEE THAT WHENEVER NEGATIVE NUMBER CAME THEN IT IS THE EXACT CAUSE OF COLLISION
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(st.isEmpty() || arr[i] >0){  //agar positive ya empty so blind insertion
                st.push(arr[i]);
            }
            else{    // agar array ka current element is negative
               
               while(!st.isEmpty()){
                int stTop = st.peek();
                if(stTop < 0){           //agar top hai jo stack ka woh empty so simply push as same direction = not collision
                    st.push(arr[i]);
                    break;
                }
                int arrTop = Math.abs(arr[i]);  //as pata chal gaya ki stack ke top par positive number hai
                if(stTop == arrTop){    // not to push and have  also to pop
                    st.pop();
                    break;
                }
                else if(stTop < arrTop){    // at time when stack peek is lesser than array element 
                    st.pop();
                    if(st.isEmpty()){        // at time we are popping so also check if value become 0 in stack so push
                        st.push(arr[i]);
                        break;
                    }
                }
                else if(stTop > arrTop){
                    break;
                }
               }
            }
            
        }
        int result[] = new int[st.size()];
            for(int i=result.length-1;i>=0;i--){
                result[i] = st.pop();
            }
        return result;
    }
}