class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String, List<String>> map = new HashMap<>();
       for(String s : strs){
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        String keyNew = new String(ch);
        if(!map.containsKey(keyNew)){
            map.put(keyNew, new ArrayList<>());
        }
        map.get(keyNew).add(s);
       }
       return new ArrayList<>(map.values());
    }
}