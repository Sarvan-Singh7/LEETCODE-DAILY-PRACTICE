class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char answer= letters[0];
        int si = 0, ei = letters.length -1;
        while(si<=ei){
            int mid = si + (ei - si)/2;
            if(letters[mid] > target){
                answer = letters[mid];
                ei = mid -1;
            }else{
                si = mid+1;
            }
        }
        return answer;
    }
}