
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode i=head;
        ListNode j = head;
        if(head == null){return null;}
        while(j!=null){
          if(i.val == j.val){
            j=j.next;
          }
          else{
            i.next=j;
            i=j;
          }
        }
        i.next=null;
        return head;
    }
}