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


////using hashset

class Solution {
    public int lengthOfLongestSubstring(String str) {
        HashSet<Character>hm=new HashSet<>();
        int start=0;
        int max=0;
        
        
     for(int i=0;i<str.length();i++){
         char ch=str.charAt(i);
         while(hm.contains(ch)){ // ye wali loop repeating characters ko remove kar degi from set as well as start pointer increment
             hm.remove(str.charAt(start));   //also remove that character  
             start++;  // increment start as this will help to calculate length
         } 
         hm.add(ch);
         max=Math.max(max,i-start+1);
     }
     return max;
    }
}

///using array=======================best optimal
// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int l=0,r=0;
//         int maxlen = 0;
//         int hash[] = new int[256];
//         Arrays.fill(hash, -1);///all to -1 so that can update array at new value
//         while(r<s.length()){
//             if(hash[s.charAt(r)] >= l){      //so that to avoid duplicates
//                 l = Math.max(l, hash[s.charAt(r)] +1);  // math.max only works here
//             }
            
//             maxlen = Math.max(maxlen, r-l+1);
//             hash[s.charAt(r)]  = r;
//             r++;
//         }
//         return maxlen;
//     }
// }
