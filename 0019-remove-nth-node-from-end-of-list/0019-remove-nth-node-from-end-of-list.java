/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow =head;
        ListNode fast = head;
        if(head==null){return head;}
        if(head.next ==null && n==1){return null;}

        for(int i=1;i<=n;i++){             //moving in forward direction by n positions
            fast = fast.next;
        }
        if(fast ==null){return head.next;}
        while(fast.next !=null){         //now one by one move slow and fast in forward direction  {condition should be fast.next} check on dry run
            slow = slow.next;
            fast = fast.next;
        }
        slow.next=slow.next.next;       
        return head;
    }
}