class Solution {
    public static boolean isPowerOfTwo(int n){
        return n>0 && (n & (n-1)) ==0;
    }
    public static boolean isSquare(int n){
        long root = (long)Math.sqrt(n);
        return (root * root == n);
    }
    public boolean isPowerOfFour(int n) {
        return (isPowerOfTwo(n) && isSquare(n));
}
}


// class Solution {
//     public boolean isPowerOfFour(int n) {
//         if(n==1 || n==4)return true;
//         if(n%4!=0 || n<=0)return false;
//         return isPowerOfFour(n/4);
//     }
// }