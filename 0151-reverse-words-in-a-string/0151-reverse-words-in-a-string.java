// class Solution {
//     public String reverseWords(String s) {
//         String[] arr = s.split(" ");
//         StringBuilder sb = new StringBuilder();
//         for(int i=arr.length-1;i>=0;i--){
//                if(sb.length()==0 && arr[i]!=" "){
//                 sb.append(arr[i]);
//                }
//                if(arr[i].length()==0 && i<arr.length-1){   ///arr[i] ==" " not work so use arr[i].length()
//                 continue;
//                }
//                if(arr[i] !=" " && i<arr.length-1){
//                 sb.append(" ");
//                 sb.append(arr[i]);
//                }
//         }
//         return sb.toString();
//     }
// }

class Solution {
    public String reverseWords(String s) {
        // Step 1: Trim spaces and split by one or more spaces
        String[] words = s.trim().split("\\s+");

        // Step 2: Use StringBuilder to reverse
        StringBuilder sb = new StringBuilder();

        // Step 3: Append words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) sb.append(" "); // Add space between words, not after last
        }

        // Step 4: Return final string
        return sb.toString();
    }
}
