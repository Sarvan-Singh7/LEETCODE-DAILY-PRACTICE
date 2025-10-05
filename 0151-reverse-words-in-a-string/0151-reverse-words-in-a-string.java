class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
               if(sb.length()==0 && arr[i]!=" "){
                sb.append(arr[i]);
               }
               if(arr[i].length()==0 && i<arr.length-1){
                continue;
               }
               if(arr[i] !=" " && i<arr.length-1){
                sb.append(" ");
                sb.append(arr[i]);
               }
        }
        return sb.toString();
    }
}