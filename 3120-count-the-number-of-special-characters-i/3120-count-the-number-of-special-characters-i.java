class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> set = new HashSet<>();
        int count =0;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            set.add(ch); 
        }
        for(char ch = 'a'; ch <='z';ch++){
            if(set.contains(ch) && set.contains((char)(ch - 32))){
                count++;
            }
        }
        return count;
    }
}