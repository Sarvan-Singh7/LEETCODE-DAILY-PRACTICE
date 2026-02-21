// class Solution {
//     public int numberOfSubstrings(String s) {
//         int count =0;
//         for(int i=0;i<s.length();i++){
//             HashMap<Character, Integer> map = new HashMap<>();
//             for(int j=i;j<s.length();j++){
//                 char ch = s.charAt(j);
//                 map.put(ch, map.getOrDefault(ch, 0) +1);
//                 if(map.containsKey('a') && map.containsKey('b') && map.containsKey('c')){
//                     count++;
//                 }
                
//             }
//         }
//         return count;
//     }
// }


///NICHE WALA CODE LEFT WITH 1 TEST CASE 
// class Solution {  // slightly optimal as i am breaking after i find a valid a,b,c in a substring then i do break as AGAR 'A', 'B', 'C' MIL GAYE TOH AGE WALI BHI SARE SUSTRING VALID SO I ADDED IT ALSO IN COUNT;
//     public int numberOfSubstrings(String s) {
//         int count=0;
//         for(int i =0;i < s.length();i++){
//              int Hash [] = new int[3];
//              for(int j=i;j<s.length();j++){
//                 Hash[s.charAt(j) - 'a'] =1;
//                 if(Hash[0] + Hash[1] + Hash[2] == 3){
//                     count = count+ (s.length() - j);
//                     break;
//                 }
//              }
//         }
//         return count;
//     }
// }


class Solution {
    public int numberOfSubstrings(String s) {
        int count=0;
        int Hash[] = new int[3];
        Arrays.fill(Hash, -1);
        for(int right=0;right<s.length();right++){
           Hash[s.charAt(right) - 'a'] = right;
           if(Hash[0] != -1 && Hash[1] != -1 && Hash[2] != -1){
               int mini = Math.min(Hash[0], Math.min(Hash[1], Hash[2]));
               count = count + (mini - 0 +1) ;//as minimum se right tak ek substring of current window and -0 means woh starting se hi hogi and also +1 because jo minimum se right tak hogi woh bhi add
           }
        }
        return count;
    }
}












