// class Solution { ///O(m * nlogn) TC and O(m *n)SC
//     public List<List<String>> groupAnagrams(String[] strs) {
//         HashMap<String, List<String>> map = new HashMap<>();
//         for(int i=0;i<strs.length;i++){
//             char[] arr = strs[i].toCharArray();
//             Arrays.sort(arr);
//             String s = new String(arr);
//             if(!map.containsKey(s)){
//                 map.put(s, new ArrayList<>());   //u have to declare thisbecause we cannot declare direct interface 
//             }
//             map.get(s).add(strs[i]);
//         }
//         return new ArrayList<>(map.values());
//     }
// }

class Solution {///O(m*n) TC and same SC
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            int[] ch = new int[26];
            for(char s : strs[i].toCharArray()){
                ch[ s - 'a']++;  ///storing all character Frequency
            }
            StringBuilder sb = new StringBuilder();
            //now we will make key based on frequewncy of each character and after each character i will insert # so that no duplicate Key formed example if aaaaaaaaaaab & abbbbbbbbbbb will be all 3 ones so duplicate so i add # after each so it becomes 11#1# and 1#11# so unique
            for(int s : ch){
                sb.append(s).append('#');
            }
            if(!map.containsKey(sb.toString())){
                map.put(sb.toString(), new ArrayList<>());
            }
            
            map.get(sb.toString()).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}