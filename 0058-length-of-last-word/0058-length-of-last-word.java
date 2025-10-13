class Solution {
    public int lengthOfLastWord(String s) {
        s.trim();
        String[] str = s.split("\\s+");
        String a=str[str.length -1];
        return a.length();
    }
}