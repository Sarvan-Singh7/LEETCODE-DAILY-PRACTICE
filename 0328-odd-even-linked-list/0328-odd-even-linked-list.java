///////////////////////////BRUTE?????????????????????????????????????/////////
// class Solution {
//     public ListNode oddEvenList(ListNode head) {

//             if(head == null || head.next==null){
//             return head;}
        

//         ListNode tempo = new ListNode(0);  //for collecting even indices
//         ListNode  tempe = new ListNode(-1); //---odd
//         ListNode temp1=tempo;
//         ListNode temp2 = tempe;
//         ListNode temp = head;
//         int count=1;                                     //this will help to know even or odd indices
//         while(temp!=null){
//             if(count%2==0){
//                 ListNode a= new ListNode(temp.val);  //this is mendatory whenever tobreak LL
//                 temp2.next = a;
//                 temp2=a;
            
//             }
//             else{
//                 ListNode a= new ListNode(temp.val);
//                 temp1.next = a;
//                 temp1=a;
//             }
//             temp=temp.next;
//             count++;
//         }
//         temp1.next= tempe.next;   //check  id o not did tempo.next = tempe.next because tempo toh phli node ko hi point kar raha hia ji so ye dhyaaan rakhna ki temp1last tak pohanch chuka so uske aage lagao;
//         return tempo.next;
//     }

// }


class Solution {
    public ListNode oddEvenList(ListNode head) {

            if(head ==null || head.next == null){
                return head;

            }
            ListNode Odd=head;
            ListNode Even=head.next;
            ListNode temp = head.next;
            while(Even!=null && Even.next !=null){
                Odd.next = Odd.next.next;
                Even.next=Even.next.next;
                Odd=Odd.next;
                Even=Even.next;
            }
            Odd.next = temp;
            return head;


    }

}