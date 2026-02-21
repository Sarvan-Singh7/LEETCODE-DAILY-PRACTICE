class Solution {
    public int characterReplacement(String s, int k) {
        int maxLength=0;
        int MaxFreq =0;
        int left =0;
        int Hash[] = new int[26];//as only 26 Characters
        for(int right =0;right < s.length();right++){
            Hash[s.charAt(right) - 'A']++;
            MaxFreq = Math.max(MaxFreq,Hash[s.charAt(right) - 'A']);
            int changes = (right -left+1) - MaxFreq;
            if(changes<=k){
                maxLength = Math.max(maxLength, right-left+1 );
            }else{
                Hash[s.charAt(left)-'A']--;
                left++;
            }
        }
        return maxLength;

    }
}




// class Solution {
//     public int characterReplacement(String s, int k) {
//         int maxLength=0;
//         int maxFreq =0;
//         for(int i=0;i<s.length();i++){
//             int Hash[] = new int[26];
//             for(int j=i;j<s.length();j++){
//                 Hash[s.charAt(j) - 'A']++;
//                 maxFreq = Math.max(maxFreq, Hash[s.charAt(j) - 'A']);
//                 int changes = (j-i+1) - maxFreq;  // minus from (j-i+1) means from subaprt
//                 if(changes <=k){
//                     maxLength = Math.max(maxLength, j-i+1);
//                 }
//                 else{
//                     break;
//                 }
//             }
//         }
//         return maxLength;
//     }
// }