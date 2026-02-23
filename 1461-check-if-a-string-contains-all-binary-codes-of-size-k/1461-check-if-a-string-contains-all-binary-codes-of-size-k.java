class Solution {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String> set = new HashSet<>();
        int n= s.length();
        for(int i=0;i<n-k+1;i++){
             set.add(s.substring(i, i+k));
        }
        return (set.size() ==(int)Math.pow(2, k))? true : false;
    }
}