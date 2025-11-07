
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode Temp = dummy;
        ListNode i=head.next;
        ListNode j = head.next;
        int sum=0;
        while(j!=null){
            if(j.val ==0 && sum!=0){
              ListNode a = new ListNode(sum);
              Temp.next =a;
              Temp=a;
              i=j;
              j=j.next;
              sum=0;
            }
            else{
                sum+=j.val;
                j=j.next;
            }
        }
        
        return dummy.next;

    }
}