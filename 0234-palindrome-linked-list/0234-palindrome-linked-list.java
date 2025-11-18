
// class Solution {   /////////////////please try it once dry run asit may cause problem
//     public ListNode reverse(ListNode head){

//         ListNode prev = null;
//         ListNode ahead = null;
//         ListNode curr=head;
//         while(curr !=null){
//             ahead = curr.next;
//             curr.next = prev;
//             prev =curr;
//             curr = ahead;
//         }
//         return prev;
        
//     }
//     public boolean isPalindrome(ListNode head) {
//         if(head == null || head.next == null)return true;
//         ListNode slow = head;
//         ListNode fast = head;
//         while(fast !=null && fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//         }
//         ListNode SlowNext = reverse(slow);   //note down i dont pass slow.next
        
//         ListNode NodeStart = head;
//         while(SlowNext !=null){   //handle all edge cases so used
//            if(SlowNext.val != NodeStart.val){return false;}
//            NodeStart = NodeStart.next;
//            SlowNext = SlowNext.next;
           
//         }
//         return true;
        
//     }
// }

////////////////////////Brute Solution hai ji 

// class Solution {
    
//     // \U0001f539 Function to create a deep copy of the given linked list
//     public ListNode copyList(ListNode head) {
//         if (head == null) return null;
        
//         ListNode dummy = new ListNode(0);
//         ListNode tail = dummy;
//         ListNode curr = head;
        
//         while (curr != null) {
//             tail.next = new ListNode(curr.val);
//             tail = tail.next;
//             curr = curr.next;
//         }
        
//         return dummy.next;
//     }
    
//     // \U0001f539 Function to reverse a linked list
//     public ListNode reverse(ListNode head) {
//         ListNode prev = null;
//         ListNode curr = head;
//         ListNode next = null;
        
//         while (curr != null) {
//             next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }
//         return prev;
//     }
    
//     // \U0001f539 Function to check if palindrome
//     public boolean isPalindrome(ListNode head) {
//         if (head == null || head.next == null) return true;

//         // Step 1: Make a copy of the list
//         ListNode copyHead = copyList(head);

//         // Step 2: Reverse the copied list
//         ListNode reversedHead = reverse(copyHead);

//         // Step 3: Compare both lists node by node
//         ListNode temp1 = head;
//         ListNode temp2 = reversedHead;

//         while (temp1 != null && temp2 != null) {
//             if (temp1.val != temp2.val) {
//                 return false;  // mismatch found
//             }
//             temp1 = temp1.next;
//             temp2 = temp2.next;
//         }

//         return true;
//     }
// }

class Solution {
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode ahead = head;
        ListNode prev = null;
        while(curr !=null){
            ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode slowNext = reverse(slow);
        
        while(slowNext != null){
            if(slowNext.val != head.val){
                      return false;
            }
            slowNext = slowNext.next;
            head=head.next;
        }
        return true;
    }
}
