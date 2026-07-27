// class Solution {   ///O(N cube)
//     public static int frequencyHelper(String s){
//         HashMap<Character, Integer> map = new HashMap<>();
//         int maxi = Integer.MIN_VALUE, mini =Integer.MAX_VALUE;
//         for(int i=0; i<s.length();i++){
//             char ch = s.charAt(i);
//             map.put(ch, map.getOrDefault(ch, 0) + 1);
            
//         }
//         for(char key : map.keySet()){
//             int val = map.get(key); 
//             maxi = Math.max(maxi, val);
//             mini = Math.min(mini, val);
//         }
//         return maxi-mini;
//     }
//     public int beautySum(String s) {
//         int n = s.length();
//         int sum = 0;
//         for(int i=0; i<n;i++){
//             for(int j = i+1; j<=n;j++){    ////<= hi chalana hai otherwise not work
//                 String sub = s.substring(i, j);
                
//                     sum = sum + frequencyHelper(sub);
                
//             }
//         }
//         return sum;
//     }
// }




class Solution {    ///O(n Square ) rather have 3 loops
    public int beautySum(String s) {
        int n = s.length();
        int sum = 0;
        
        for(int i=0; i<n;i++){
            int freq[] = new int[26];
            
            for(int j = i; j<n;j++){
                int maxi = Integer.MIN_VALUE; int mini = Integer.MAX_VALUE;  // yahan par hi likhna hai so that refresh on each run
                char ch = s.charAt(j);
                freq[ch - 'a']++;

                for(int k =0; k<26; k++){  //constant so not contribute to total TC
                    int val = freq[k];
                    if(val >0){
                        maxi = Math.max(maxi, val);
                        mini = Math.min(mini, val);
                    }
                }
                sum += maxi - mini;  ///inside 2 loops as we want to calculate at each subpart
            }
        }
        return sum;
    }
}