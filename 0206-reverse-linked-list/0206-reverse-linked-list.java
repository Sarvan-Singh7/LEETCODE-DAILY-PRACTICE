//solve by arrayList, Stack ans iterative and Recursive
// class Solution {
//     public ListNode reverseList(ListNode head) {
//         ListNode current = head;
//         ListNode previous = null;
//         ListNode after = null;
//         while(current != null){
//             after = current.next;
//             current.next = previous;
//             previous = current;
//             current = after;
//         }
//         return previous;
        
//     }
// }

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null)return null;
        Stack<ListNode> st = new Stack<>();
        ListNode helper = head;
        while(helper != null){
            st.push(helper);
            helper = helper.next;
        }
        
        ListNode newHead = st.pop();
        ListNode dummy = newHead;
        while(!st.isEmpty()){
            ListNode temp = st.pop();
            dummy.next = temp;
            dummy = dummy.next;
        }
        dummy.next = null;
        return newHead;
        
    }
}


// class Solution {
//     public ListNode reverseList(ListNode head) {
//         ListNode curr=head;
//         ListNode prev=null;
//         ListNode ahead=head;
//         while(curr != null){
//             ahead=curr.next;
//             curr.next = prev;
//             prev=curr;
//             curr=ahead;
//         }
//         return prev;
//     }
// }