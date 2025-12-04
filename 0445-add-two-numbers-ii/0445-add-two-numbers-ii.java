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
    public ListNode reverse(ListNode head){
        ListNode curr = head,ahead = head,prev=null;
        while(curr != null){
            ahead = curr.next;
            curr.next =prev;
            prev = curr;
            curr = ahead;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ll1 = reverse(l1);
        ListNode ll2 = reverse(l2);     //reversing both lists so that i can get iterate from left to right
        ListNode answer = new ListNode(0);     //used to store resultant list
        ListNode iterate = answer;              
        int carry = 0;
        while(ll1 !=null || ll2 != null){
            int sum =carry;                  //so that on every iteration new sum updated by carry value
            if(ll1 !=null){
                sum += ll1.val;              //only sum if not empty
                ll1 = ll1.next;
            }
            if(ll2 != null){
                sum += ll2.val;
                ll2 = ll2.next;
            }
            ListNode temp = new ListNode(sum%10);    //% used so less than 10 is as same as it was
            carry = (sum/10);                        // important to update carry on every iteration
            iterate.next = temp;
            iterate = temp;
        }
        if(carry >0){
            ListNode temp = new ListNode(carry);
            iterate.next = temp;
        }
        ListNode answerReversed = reverse(answer.next);
        return answerReversed;
    }
}