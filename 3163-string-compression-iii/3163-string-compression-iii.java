class Solution {
    public String compressedString(String s) {
        int i = 0;
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        while(i < n){
            char current = s.charAt(i);
            int count =0;
            
            while(i < n && s.charAt(i) == current){
                count++;
                i++;
                if(count > 9){
                    sb.append(9);
                    sb.append(current);
                    count =1;
                }
            }
            sb.append(count);
            sb.append(current);
            
        }
        return sb.toString();
    }
}