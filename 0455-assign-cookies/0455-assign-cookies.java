class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int left = 0, right =0;
        while(left < s.length && right < g.length){
            if(s[left] >= g[right]){
                right++;
                left++;
            }
            else if(s[left] < g[right]){
                left++;
            }
        }
        return right;
    }
}