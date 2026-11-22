class Solution {
    public boolean checkString(String s) {
        char ch = s.charAt(0);
        int n = s.length();
        int count =0;
        for(int i=1; i<n;i++){
            if(s.charAt(i) == 'a' && ch == 'b')return false;
            if(s.charAt(i) != ch){
                ch = s.charAt(i);
                count++;
            }
            if(count == 2)return false;
        }
        return true;
    }
}