class Solution {
    public int[] asteroidCollision(int[] arr) {// SEE THAT WHENEVER NEGATIVE NUMBER CAME THEN IT IS THE EXACT CAUSE OF COLLISION
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            if(arr[i] > 0){
                st.push(arr[i]);
            }else{
                while(!st.isEmpty() && st.peek() > 0 && Math.abs(arr[i]) > st.peek()){
                    st.pop();
                }
                if(!st.isEmpty() && st.peek() == Math.abs(arr[i])){
                    st.pop();
                }
                else if(st.isEmpty() || st.peek() < 0)st.push(arr[i]);


            }
        }
        int answer[] = new int[st.size()];
        for(int i=answer.length -1;i>=0;i--){
            answer[i] = st.pop();
        }
        return answer;
            
        }
        
    }





// class Solution {
//     public int[] asteroidCollision(int[] arr) {// SEE THAT WHENEVER NEGATIVE NUMBER CAME THEN IT IS THE EXACT CAUSE OF COLLISION
//         Stack<Integer> st = new Stack<>();
//         for(int i=0;i<arr.length;i++){
//             if(st.isEmpty() || arr[i] >0){  //agar positive ya empty so blind insertion of negative and positive 
//                 st.push(arr[i]);
//             }
//             else{    // agar array ka current element is negative
               
//                while(!st.isEmpty()){
//                 int stTop = st.peek();
//                 if(stTop < 0){           //agar top hai jo stack ka woh empty so simply push as same direction = not collision
//                     st.push(arr[i]);
//                     break;
//                 }
//                 int arrTop = Math.abs(arr[i]);  //as pata chal gaya ki stack ke top par positive number hai
//                 if(stTop == arrTop){    // not to push and have  also to pop
//                     st.pop();
//                     break;
//                 }
//                 else if(stTop < arrTop){    // at time when stack peek is lesser than array element 
//                     st.pop();
//                     if(st.isEmpty()){        // at time we are popping so also check if value become 0 in stack so push
//                         st.push(arr[i]);
//                         break;
//                     }
//                 }
//                 else if(stTop > arrTop){
//                     break;
//                 }
//                }
//             }
            
//         }
//         int result[] = new int[st.size()];
//             for(int i=result.length-1;i>=0;i--){
//                 result[i] = st.pop();
//             }
//         return result;
//     }
// }



   // also good solution to overview
// class Solution {
//     public int[] asteroidCollision(int[] asteroids) {
//         Stack<Integer> star = new Stack<>() ;
//         int l = asteroids.length ;

//         for(int i = 0 ; i < l ; i++){
//             while(true){

//             if(star.isEmpty() ){
//                 star.push(asteroids[i]);
//                 break;
//             }else if(asteroids[i] > 0 && star.peek() > 0){      // if both stack top and current are of same sign
//                 star.push(asteroids[i]);    
//                 break;
//             }else if(asteroids[i] < 0 && star.peek() < 0){      // they won't collide
//                 star.push(asteroids[i]);
//                 break;
//             }else if(asteroids[i] > 0 && star.peek() < 0){      //also if stack top is -ve(left) and current is
//                 star.push(asteroids[i]);                        //+ve(right) , they won't collide as well
//                 break;
//             }else{          //collide oonly if current one is -ve(left) previous is +ve(right)
//                 if(asteroids[i]*-1 > star.peek() ){             
//                     star.pop();
//                 }else if(asteroids[i]*-1 == star.peek()){
//                     star.pop();
//                     break;
//                 }else{
//                     break;
//                 }
//             }

//             }

//         }

//         l = star.size();
//         int[] result = new int[l];
//         int i = l-1 ;
//         while(!star.isEmpty()){
//             result[i]=star.peek();
//             star.pop();
//             i--;
//         }

//         return result ;
//     }

//     static{
//     Runtime.getRuntime().addShutdownHook(new Thread(() -> {
//         try (java.io.FileWriter fw = new java.io.FileWriter("display_runtime.txt")) {
//             fw.write("0");
//         } catch (Exception e) {
//         }
//     }));}

// }