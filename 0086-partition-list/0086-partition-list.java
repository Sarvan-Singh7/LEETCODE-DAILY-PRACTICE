
class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head ==null || head.next ==null){return head;}
        ListNode slist  = new ListNode(-1);
        ListNode blist  = new ListNode(0);
        ListNode small= slist;
        ListNode bigg = blist;
        ListNode temp = head;
        while(temp != null){             //simple adjusting values
            if(temp.val < x){
                small.next = temp;
                small = temp;
            }else{
                bigg.next = temp;
                bigg = temp;
            }
            temp = temp.next;
        }
        small.next = blist.next;
        bigg.next = null;                          ///VERY IMPORTANT LINE AS bigg f not null at last so found cycle in LL 
        return slist.next;
        
    }
}