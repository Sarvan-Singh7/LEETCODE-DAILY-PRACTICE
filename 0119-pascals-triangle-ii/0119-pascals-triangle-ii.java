class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> answer = new ArrayList<>();  //outer arraylist creation.
        int n=rowIndex +1;               ///////////////////MAIN THING THAT I TAKE LAST INDEX TILL WE HAVE TO CALCULATE PASCAL TRIANGLE
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
        return answer.get(rowIndex); //return answer in last AND SEE THAT I ONLY RETURN ROW WHICH HAVE TO BE RETURNED;
    }
}