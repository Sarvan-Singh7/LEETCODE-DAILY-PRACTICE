// class Solution {
//     public String mergeAlternately(String word1, String word2) {
//         StringBuilder answer = new StringBuilder();
//         int i=0;
//         while(i<word1.length() || i<word2.length()){
//             if(i<word1.length()){
//                 answer.append(word1.charAt(i));
//             }
//             if(i<word2.length()){
//                 answer.append(word2.charAt(i));
//             }
//             i++;
//         }
//         return answer.toString();
//     }
// }

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder answer = new StringBuilder();
        int i=0,j=0;
        while(i<word1.length() && i<word2.length()){
            answer.append(word1.charAt(i++));
            answer.append(word2.charAt(j++));
        }
        while(i<word1.length()){
            answer.append(word1.charAt(i++));
        }
        while(j<word2.length()){
            answer.append(word2.charAt(j++));
        }
        return answer.toString();
    }
}