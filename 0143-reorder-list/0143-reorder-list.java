
class Solution {
    public ListNode reverseList(ListNode head){   //Reverse Logic
        ListNode curr = head;
        ListNode ahead=head;
        ListNode prev = null;
        while(curr != null){
            ahead=curr.next;
            curr.next = prev;
            prev=curr;
            curr=ahead;
        }
        return prev;
        
    }
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next !=null){  //FInding Middle
            slow=slow.next;
            fast = fast.next.next;
        }
        // reversing the second half of the list
       ListNode newNode = reverseList(slow.next);
      // breaking the list from the middle
        slow.next=null;
   //merging both list
       //first half list pointer
       ListNode curr = head;
       //second half list pointer
       ListNode dummy = newNode;
       while(curr!=null && dummy!=null){
             //pointer to store next element of curr(1st half list)
           ListNode temp = curr.next;
           //link element of 1st half to that of second half
           curr.next=dummy;
           //pointer to store next element of dummy(2nd half list)
           ListNode temp2=dummy.next;
           //link the rest of the first half list
           dummy.next=temp;
           //increment curr and dummy pointer to do the same thing again and again util we reach end of the any one list or both list
           curr=temp;
           dummy=temp2;
       }
        
    }
}