class Solution {
    //main logic is that whenever opening is leass than n and closing is less than opening count so i can say that whenever both equal then it will be added to arraylist
    public void generate(ArrayList<String> arr , int n, int oc, int cc, String s){
        if(oc == n && cc == n){   // oc = opening count, cc = closing count
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
        System.out.println(arr.size());  // so to return count;
        return arr;
    }
}