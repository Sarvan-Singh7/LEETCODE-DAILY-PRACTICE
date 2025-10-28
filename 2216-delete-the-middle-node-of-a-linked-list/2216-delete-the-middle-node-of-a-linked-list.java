
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
    public ListNode deleteMiddle(ListNode head) {
        ListNode prevSlow = null;
        ListNode slow =head;
        ListNode fast = head;
        if(head == null || head.next == null){return null;}
        while(fast != null && fast.next != null){
            prevSlow=slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(prevSlow == null){return null;}  //it means that loop runs only once so contains one node only
        prevSlow.next = slow.next;
        return head;
    }
}