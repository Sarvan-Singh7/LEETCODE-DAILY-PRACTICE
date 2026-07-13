class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> arr = new ArrayList<>();
        ////we will Generate all that numbers
        for(int start = 1; start <=9; start++){
            int num = start;
            for(int next = start+1; next <= 9 ; next++){
                num = num * 10 + next;

                if(num >= low && num <= high){
                    arr.add(num);
                }
                if(num > high){
                    break;
                }
            }
        }
        Collections.sort(arr);
        return arr;
    }
}