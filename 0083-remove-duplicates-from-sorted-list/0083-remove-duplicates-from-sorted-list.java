
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null ){
            return head;
        }
        ListNode i = head;
        ListNode j = head.next;
        while(j != null){
            if(i.val == j.val){
                j=j.next;
            }
            else if(i.val !=j.val){
                i.next = j;
                i=j;
                j=j.next;
            }
        }
        i.next = null;
        return head;
    }
}