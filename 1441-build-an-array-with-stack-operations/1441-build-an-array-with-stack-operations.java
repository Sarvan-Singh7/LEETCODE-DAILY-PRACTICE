class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> arr = new ArrayList<>();
        int idx =0;
        for(int i=1;i<=n;i++){
                    arr.add("Push");
        if(present(i,target) == 1 ){
            idx++;
        }
        else if(arr.size() >0 || present(i,target) == 0){
                arr.add("Pop");
            }
            if(idx == target.length){break;}
        }
        return arr;
    }
    public int present(int n, int target[]){
        for(int i=0;i<target.length;i++){
            if(target[i] == n){
                return 1;
            }
        }
        return 0;
    }
}