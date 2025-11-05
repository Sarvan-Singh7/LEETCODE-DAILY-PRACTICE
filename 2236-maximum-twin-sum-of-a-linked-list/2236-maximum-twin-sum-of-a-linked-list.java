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
        ListNode curr = head;
        ListNode prev = null;
        ListNode ahead = null;
        while(curr !=null){
            ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr=ahead;
        }
        return prev;
    }
    public int pairSum(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;
        while(fast !=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode Rev = reverse(slow);
        ListNode temp=head;
        int maxi = Integer.MIN_VALUE;
        while(Rev !=null){
            if(temp.val + Rev.val > maxi){
                maxi = temp.val + Rev.val;
                
            }
            Rev = Rev.next;
            temp=temp.next;
        }
        return maxi;
    }
}