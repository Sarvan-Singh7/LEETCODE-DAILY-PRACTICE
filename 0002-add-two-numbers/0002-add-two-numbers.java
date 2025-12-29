
// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         ListNode dummy = new ListNode(-1);
//         ListNode curr = dummy;
//         int carry=0;
//         while(l1!=null || l2 != null){
//             int sum=carry;
//             if(l1 !=null){
//                 sum = sum + l1.val;l1=l1.next;
//             }
//             if(l2 !=null){
//                 sum = sum + l2.val;l2=l2.next;
//             }
//             ListNode tempo = new ListNode(sum % 10);
//             carry = (sum/10);

//             curr.next = tempo;
//             curr=tempo;
            
            
            
//         }
//         if(carry !=0){
//             ListNode temo = new ListNode(carry);
//             curr.next = temo;
//         }
//         return dummy.next;
//     }
// }


class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode dummy = new ListNode(-1);
       ListNode temp = dummy;
       int sum =0,carry =0;
       while(l1 != null || l2 != null){
        sum= carry;           // carry bhi add karni hai
          if(l1 != null){
            sum+= l1.val;
            l1 = l1.next;
          }
          if(l2 != null){
            sum += l2.val;
            l2 = l2.next;
          }
          ListNode a = new ListNode(sum%10);
          carry = sum/10;
          temp.next = a;
          temp =a;
       }
       if(carry ==1){
        ListNode a = new ListNode(1);
        temp.next = a;
          temp =a;
       }

       return dummy.next;

    }
}