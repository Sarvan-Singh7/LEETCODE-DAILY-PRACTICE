
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next ==null && n==1){return head.next;}
        ListNode slow = head;
        ListNode fast = head;
        for(int i=1;i<=n;i++){   //see that we travel till n because so that slow nth element se ek element piche ruke ji
            fast = fast.next;
        }
        if(fast == null){        //please check this condition as this will happen so means that n== length of node or something like that
            return head.next;
        }
        while(fast.next != null){   //see that this is fast.next(not fast) because hame slow ko ek slow.prev pe rokna hai
            slow=slow.next;
            fast=fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}