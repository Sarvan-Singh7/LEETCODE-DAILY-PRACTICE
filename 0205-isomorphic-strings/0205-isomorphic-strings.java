class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        int n = s.length();

        for(int i=0;i<n;i++){
            char sCh = s.charAt(i);
            char tCh = t.charAt(i);
            if(!map1.containsKey(sCh)){
                map1.put(sCh, i);
            }
            if(!map2.containsKey(tCh)){
              map2.put(tCh, i);  
            }
            

            if(( map1.get(sCh) != (map2.get(tCh)) )){   //
                return false;
            }
        }
        return true;
    }
}