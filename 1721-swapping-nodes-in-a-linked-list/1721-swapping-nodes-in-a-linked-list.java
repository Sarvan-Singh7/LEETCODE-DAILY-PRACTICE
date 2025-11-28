
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode left = head;
        for(int i=1;i<=k -1; i++){   //left k stored in  left variable 
            left = left.next;
        }
        ListNode slow = head;
        ListNode fast = head;
        for(int i=1;i<=k ;i++){   //move fast by k steps  
            fast =fast.next;
        }
        while(fast !=null){    //gradually move slow and fast by one so that slow comes to n from last
            slow = slow.next;
            fast = fast.next;
        }
        int temp = slow.val;    //swapping
        slow.val = left.val;
        left.val = temp;
        return head;
    }
}