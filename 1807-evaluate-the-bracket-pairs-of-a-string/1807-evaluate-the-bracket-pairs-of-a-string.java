class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> map = new HashMap<>();
        for(int i=0; i<knowledge.size();i++){
            map.put(knowledge.get(i).get(0), knowledge.get(i).get(1));
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                String subPart = "";
                while(s.charAt(i) != ')'){
                    if(s.charAt(i) != ')' && s.charAt(i) != '('){
                       subPart += s.charAt(i); 
                    }
                    i++;
                }
                System.out.println(subPart);
                if(map.containsKey(subPart)){
                    sb.append(map.get(subPart));
                }
                else{
                    sb.append("?");
                }
            }
            else sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}