// class Solution {    ====== BRUTE SOLUTION
//     public int lengthOfLongestSubstring(String s) {
//         if(s==null || s.length() ==0)return 0;
//         int maxLength = Integer.MIN_VALUE;
//         for(int i=0;i<s.length();i++){
//             int Hashing[] = new int[256];
            
//             for(int j=i;j<s.length();j++){
//                 int index = s.charAt(j);
//                 if(Hashing[index] ==1){
//                     break;
//                 }
//                 maxLength = Math.max(maxLength, j-i+1);
//                 Hashing[index] =1;
//             }
//         }
//         return maxLength;
//     }
// }


class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,r=0;
        int maxlen = 0;
        int hash[] = new int[256];
        Arrays.fill(hash, -1);///all to -1 so that can update array at new value
        while(r<s.length()){
            if(hash[s.charAt(r)] >= l){
                l = Math.max(l, hash[s.charAt(r)] +1);
            }
            
            maxlen = Math.max(maxlen, r-l+1);
            hash[s.charAt(r)]  = r;
            r++;
        }
        return maxlen;
    }
}
