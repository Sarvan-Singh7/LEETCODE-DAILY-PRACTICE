class Solution {
    public int compress(char[] chars) {
        int read = 0;
        int write = 0;
        int n = chars.length;

        while(read < n){
            char curr = chars[read];
            int count =0;
            while(read < n && chars[read] == curr){
                count++;
                read++;
            }
            chars[write++] = curr;
            if(count > 1){
               String s = Integer.toString(count);
               for(char ch : s.toCharArray())chars[write++] = ch; 
            }
            
        }
        return write;
    }
}