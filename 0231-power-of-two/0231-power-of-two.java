
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0)return false;   // if n=0 so not power of 2;
        if(n==1)return true;    ///on diving if at any point it equals 1 so return true as 1 = 2 raised to power 0
        if(n%2 ==1)return false;   //odd number so return flase
        return isPowerOfTwo(n/2);
    }
}



// class Solution {
//     public boolean isPowerOfTwo(int n) {
//         int count =0;
//         for(int i=0;i<31;i++){
//             if(n%2 == 1){
//                 count++;
//             }
//             n=n>>1;
//         }
//         return count ==1;
//     }
// }