class Solution {
    public int[] plusOne(int[] arr) {
        ArrayList<Integer> answer = new ArrayList();
        int carry =1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i] + carry <=9){
               answer.add(arr[i] + carry);
               carry =0;
            }
            else{
                answer.add(0);
                carry = 1;
            }
        }
        if(carry ==1){
            answer.add(1);
        }
        int arr2[] = new int[answer.size()];
        int n= answer.size();
        for(int i=answer.size()-1;i>=0;i--){
            arr2[n-1-i] = answer.get(i);
        }
        return arr2;
    }
}