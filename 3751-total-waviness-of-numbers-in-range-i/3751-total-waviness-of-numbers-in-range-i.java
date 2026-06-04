class Solution {
    public int totalWaviness(int num1, int num2) {
        int count=0;
        for(int i=num1;i<=num2;i++){
             String s = Integer.toString(i);
             char[] arr = s.toCharArray();
             for(int j=1;j<arr.length -1; j++){
                if(arr[j-1] < arr[j] && arr[j+1] < arr[j]){
                    count++;
                }
                if(arr[j-1] > arr[j] && arr[j+1] > arr[j]){
                    count++;
                }
             }
        }
        return count;
    }
}