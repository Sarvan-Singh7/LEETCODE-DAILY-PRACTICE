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
    public ListNode reverseList(ListNode head){
        ListNode curr = head,ahead = head,prev = null;
        while(curr !=null){
            ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode slow  = head;
        ListNode fast = head;
        while(fast !=null && fast.next != null){    //finding middle to reverse half portion
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode slowNext = reverseList(slow.next);   //reverse the nodes function and n reverse always pass slow (not slow.next)
        slow.next = null;                            //Very Important to do so that list now divided into two lists
        ListNode curr = head;
        ListNode rev = slowNext; 

        while(curr !=null && rev != null){        //when any of list empty so stop loop
            ListNode temp = curr.next;
            ListNode dummy2 = rev.next;           //storing current of both to do so 
            curr.next = rev;
            rev.next = temp;
            curr = temp;
            rev = dummy2;
        } 
    }
}