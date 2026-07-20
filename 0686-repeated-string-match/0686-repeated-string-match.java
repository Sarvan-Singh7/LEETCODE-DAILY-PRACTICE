class Solution {
    public int repeatedStringMatch(String a, String b) {
        int count =0;
        
        StringBuilder sb = new StringBuilder();
        while(sb.indexOf(b) == -1){  //jab tak substring nahin ban jata
            if(sb.toString().contains(b)){
                return count;
            }
            if(sb.length() > b.length() + 2 * a.length()){
                return -1;
            }
            sb.append(a);
            count++;
        }

        return count;
    }
}