
class Solution {
    public int CovertToDec(String st){
        int n = st.length();
        int answer = 0;
        int power=0;
        for(int i=n-1; i>=0; i--){                   //reverse loop
           int converted = st.charAt(i) - '0';      //this is main thing used to convert a particular character to a integer
           answer+= converted * Math.pow(2,power);  //simple formula to convert to decimal
           power++;
        }
        return answer;
    }
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        
        String sum="";
        while(temp != null){
            sum += temp.val;     //storing value in a string
            temp=temp.next;
        }
        int answer =CovertToDec(sum);
        return answer;
        
    }
}