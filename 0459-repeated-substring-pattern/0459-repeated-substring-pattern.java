class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if(s.length()==0){return true;}
        String Trimmed = s+s;
        
        if (Trimmed.substring(1,Trimmed.length()-1).contains(s)){return true;}
        else{return false;}
        
    }
}