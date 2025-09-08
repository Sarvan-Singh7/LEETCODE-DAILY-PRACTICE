class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> answer = new ArrayList<>();  //outer arraylist creation.

        for(int i=0 ; i<n; i++ ){
            answer.add(new ArrayList<Integer>());   //inner arrayList creation
            for(int j=0;j<=i;j++){                          //note that loop go till j<=i
                if(j==i || j==0){ answer.get(i).add(1);}    //handling cases for 1
                else{
                    int val=answer.get(i-1).get(j) + answer.get(i-1).get(j-1);    //handling cASES IN WHICH WE HAVE TO ADD ANOTHER THAN 1
                    answer.get(i).add(val);       //MAIN THING THAT HOW TO PUSH IT MEANS  ANSWER[i].push_back(val);
                }
            }
        }
        return answer; //return answer in last;
    }
}