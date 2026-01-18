class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> arr = new ArrayList<>();
        generate(arr,n,0,0,"");
        return arr;
    }
    public void generate(List<String> arr , int n, int open, int close, String s){

        if(open == n && close == n){
            arr.add(s);
            return;
        }
        if(open < n){
            generate(arr,n,open+1,close,s+'(');    // open +1 se chala but if use open++ then not work a
        }
        if(close < open){
            generate(arr, n,open, close+1, s+')');
        }
    }
}