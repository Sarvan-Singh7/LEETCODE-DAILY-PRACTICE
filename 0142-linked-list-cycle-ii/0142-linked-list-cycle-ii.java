
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if(slow == null  || slow.next == null ){return null;}
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                break;
            }
        }
        if(fast == null || fast.next == null){return null;}
        ListNode check = head;
        while(check != slow){
            check  = check.next;
            slow = slow.next;
        }
        return slow;
    }
}