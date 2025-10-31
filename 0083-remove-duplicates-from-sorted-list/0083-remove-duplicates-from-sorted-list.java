
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)return null;
        ListNode i=head;
        ListNode j = head;
        
        while(j!=null){
          if(i.val == j.val){
            j=j.next;
          }
          else{
            i.next=j;
            i=j;
          }
        }
        i.next=j;
        return head;
    }
}