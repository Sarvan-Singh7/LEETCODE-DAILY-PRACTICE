
class Solution {
    public int CovertToDec(String st){
        int n = st.length();
        int answer = 0;
        int power=0;
        for(int i=n-1; i>=0; i--){
           int converted = st.charAt(i) - '0';
           answer+= converted * Math.pow(2,power);
           power++;
        }
        return answer;
    }
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        
        String sum="";
        while(temp != null){
            sum += temp.val;
            temp=temp.next;
        }
        int answer =CovertToDec(sum);
        return answer;
        
    }
}