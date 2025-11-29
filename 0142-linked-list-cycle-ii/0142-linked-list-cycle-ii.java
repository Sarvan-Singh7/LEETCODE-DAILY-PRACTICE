
// public class Solution {
//     public ListNode detectCycle(ListNode head) {
//         ListNode slow = head;
//         ListNode fast = head;
//         if(slow == null  || slow.next == null ){return null;}  //condition check if not any node or only one node
//         while(fast != null && fast.next != null){
//             slow = slow.next;
//             fast = fast.next.next;
//             if(slow == fast){    //have to break when both equal or share same adress
//                 break;
//             }
//         }
//         if(fast == null || fast.next == null){return null;}  //valid if somehow loop breaks or we can say loop not exists
//         ListNode check = head;
//         while(check != slow){     //new pointer which will move alongside slow and when both equal so node detected
//             check  = check.next;
//             slow = slow.next;
//         }
//         return slow;   //at last return slow;
//     }
// }


public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow =head;
        ListNode fast = head;
        while(fast !=null && fast.next !=null){
            slow=slow.next;
            fast = fast.next.next;
            if(slow==fast){
                break;
            }
        }
        if(fast ==null || fast.next ==null){
            return null;
        }
        ListNode check = head;
        while(slow != check){
            slow= slow.next;
            check = check.next;
        }
        return slow;
    }
}