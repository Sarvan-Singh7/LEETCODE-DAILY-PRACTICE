class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        for(int i=0;i<numRows; i++){
            List<Integer> helper = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j == 0 || j == i){
                    helper.add(1);
                }
                else{
                    int a = answer.get(i-1).get(j) + answer.get(i-1).get(j-1);
                    helper.add(a);
                }
            }
            answer.add(helper);
        }
        return answer;

    }

}