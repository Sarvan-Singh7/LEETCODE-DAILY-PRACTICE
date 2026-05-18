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
    public ListNode reverseKGroup(ListNode head, int k) {
        // Step 1: Check if there are at least k nodes left
        ListNode check = head;
        for (int i = 0; i < k; i++) {
            if (check == null) {
                return head; // Less than k nodes left, keep them as-is
            }
            check = check.next;
        }
        
        // Step 2: Reverse the first k nodes of the current group
        ListNode prev = null;
        ListNode curr = head;
        ListNode nextNode = null;
        
        for (int i = 0; i < k; i++) {
            nextNode = curr.next;
            curr.next = prev;  // Flip the link
            prev = curr;       // Move prev forward
            curr = nextNode;   // Move curr forward
        }
        
        // Step 3 & 4: Recurse for the remaining nodes and connect the links
        // 'head' is now the tail of our reversed group.
        // 'curr' points to the start of the next group.
        head.next = reverseKGroup(curr, k);
        
        // 'prev' has become the new head of this reversed group
        return prev;
    }
}
