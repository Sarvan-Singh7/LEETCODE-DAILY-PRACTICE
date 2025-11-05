
class Solution {
    public ListNode reverse(ListNode head){

        ListNode prev = null;
        ListNode ahead = null;
        ListNode curr=head;
        while(curr !=null){
            ahead = curr.next;
            curr.next = prev;
            prev =curr;
            curr = ahead;
        }
        return prev;
        
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)return true;
        ListNode slow = head;
        ListNode fast = head;
        while(fast !=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode SlowNext = reverse(slow);
        
        ListNode NodeStart = head;
        while(SlowNext !=null){   //handle all edge cases so used
           if(SlowNext.val != NodeStart.val){return false;}
           NodeStart = NodeStart.next;
           SlowNext = SlowNext.next;
           
        }
        return true;
        
    }
}