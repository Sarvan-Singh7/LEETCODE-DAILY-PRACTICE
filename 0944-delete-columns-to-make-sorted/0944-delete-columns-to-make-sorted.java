class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs[0].length();  // length of a column means one string length
        int count=0;
        for(int i=0;i<n;i++){
            
            for(int j=1;j<strs.length;j++){     //start form 1 so that i can compare column currennt value with previous column
                if(strs[j].charAt(i) < strs[j-1].charAt(i)){
                    count++;
                    break;
                }
            }
        }
        return count;

    }
}