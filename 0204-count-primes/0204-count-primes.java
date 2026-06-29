class Solution {
    
    public int countPrimes(int n) {
        int count =0;
        boolean primes[] = new boolean[n];
        Arrays.fill(primes, true);
        for(int i=2; i<Math.sqrt(n);i++){
            if(primes[i]){
                for(int j= i*i; j<n; j+=i){
                    primes[j] = false;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(primes[i]){
                count++;
            }
        }
        return count;
    }
}


// class Solution {   //Brute  so not work
//     public Boolean check(int n){
//         if(n<2)return false;
//         for(int i=2; i<=Math.sqrt(n);i++){
//             if(n%i == 0)return false;
//         }
//         return true;
//     }
//     public int countPrimes(int n) {
//         int count =0;
//         for(int i=0;i<n;i++){
            
//             if(check(i))count++;
//         }
//         return count;
//     }
// }