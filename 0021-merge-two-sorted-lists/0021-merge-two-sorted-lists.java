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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode dummy = new ListNode(0) ; //dummy node created to return
        ListNode temp = dummy; //dummy pe temp ko point kar diya so that make operations with temp

        while(temp1 != null && temp2 !=null){
            if(temp1.val <=temp2.val){
                ListNode a = new ListNode(temp1.val);
                temp.next = a;    //as a ko temp1 se lekar temp ke piche lagaya
                temp=a;           //temp ko bhi a pe kardo so that uska ext sahi mille
                temp1=temp1.next;   //for excluding a from node temp=temp.next kardo
            }
            else{
                ListNode a=new ListNode(temp2.val);
                temp.next =a;
                temp=a;
                temp2=temp2.next;
            }
        }
        if(temp1 ==null){
            temp.next = temp2;
        }else{
            temp.next = temp1;
        }
        return dummy.next;
    }
}