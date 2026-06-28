class Solution {
    public ListNode sortList(ListNode head) {  ////Main Code
        if(head == null || head.next == null)return head;
        ListNode mid = getMiddle(head);
        ListNode right1 = mid.next;
        mid.next = null;

        ListNode left = sortList(head);
        ListNode right2 = sortList(right1);

        return merge(left, right2);
    }
    public ListNode getMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode merge(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(-1);
        ListNode iterate = dummy;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                iterate.next = l1;
                iterate = l1;
                l1 = l1.next;
            }else{
                iterate.next = l2;
                iterate = l2;
                l2 = l2.next;
            }
        }
        if(l1 != null)iterate.next = l1;
        if(l2 != null)iterate.next = l2;
        return dummy.next;
    }
}