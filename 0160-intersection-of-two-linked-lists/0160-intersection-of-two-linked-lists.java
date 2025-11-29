public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA, b = headB;

        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }

        return a;   // either intersection or null
    }
}

// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         int len1=0;
//         int len2=0;
//         ListNode temp1 = headA;
//         ListNode temp2 = headB;
//         while(temp1 != null){
//             len1++;
//             temp1 = temp1.next;
//         }
//         while(temp2 != null){
//             len2++;
//             temp2 = temp2.next;
//         }
//         temp1 = headA;    //reset both for further process
//         temp2 = headB;
//         if(len1 >= len2){     //agar temp1 ki length badi hai toh {len1 - len2} tak loop chalakar iterate
//             for(int i=1;i <= len1-len2;i++){
//                 temp1 = temp1.next;
//             }
//         }
//         else{
//             for(int i=1;i <= len2-len1;i++){
//                 temp2 = temp2.next;
//             }
//         }
//         while(temp1!=temp2){      //condition for stopping when Equal
//             temp1 = temp1.next;
//             temp2= temp2.next;
//         }
//         return temp1;  //return temp1;
//     }
// }