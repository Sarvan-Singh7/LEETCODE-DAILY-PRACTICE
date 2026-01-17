class Solution {
    public void generate(ArrayList<String> arr , int n, int oc, int cc, String s){
        if(oc == n && cc == n){
            arr.add(s);
            return;
        }
        if(oc<n){
            generate(arr,n,oc+1,cc,s+'(');
        }
        if(cc < oc){
            generate(arr,n,oc,cc+1,s+')');
        }
    }
    public List<String> generateParenthesis(int n) {
        ArrayList<String> arr = new ArrayList<>();
        int oc=0,cc=0;
        generate(arr,n,oc,cc,"");
        return arr;
    }
}