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
        if(head.next ==null && n==1){return head.next;}
        ListNode slow = head;
        ListNode fast = head;
        for(int i=1;i<=n;i++){   //see that we travel till n+1 because so that slow nth element se ek element piche ruke ji
            fast = fast.next;
        }
        if(fast == null){
            return head.next;
        }
        while(fast.next != null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}