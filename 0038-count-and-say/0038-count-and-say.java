class Solution {
    public String countAndSay(int n) {
        String result = "1";
        for(int i=1; i<n; i++){
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for(int j = 1; j<result.length(); j++){
                
                if(result.charAt(j-1) == result.charAt(j)){
                    count++;
                }
                else{
                    sb.append(count);
                    sb.append(result.charAt(j-1));
                    count =1;
                }
            }
            sb.append(count);
            sb.append(result.charAt(result.length()-1));
            result =  sb.toString();
        }
       return result; 
    }
    
}