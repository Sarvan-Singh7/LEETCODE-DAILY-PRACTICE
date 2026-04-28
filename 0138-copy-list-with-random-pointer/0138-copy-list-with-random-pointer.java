/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node makeNext(Node head1){///function to copy all except random pounters
        Node b = new Node(-1);
        Node bTemp = b;
        Node aTemp = head1;
        while(aTemp != null){
            Node helper = new Node(aTemp.val);
            bTemp.next = helper;
            bTemp = helper;
            aTemp = aTemp.next;
        }
        return b.next;
    }
    public Node copyRandomList(Node head1) {
        /////TASK IS TO make same LL with next and random
        Node head2 = makeNext(head1);

        //next task is to assign random pointer so do By HM
        HashMap<Node, Node> map = new HashMap<>();
           //put all head1 node as key as it contains pointer and head2 as value
        Node aTemp = head1, bTemp = head2;
        while(aTemp != null){
            map.put(aTemp, bTemp);
            aTemp = aTemp.next;
            bTemp = bTemp.next;
        }
        //nnow to assign a wale a pe random as it is to b wale ,b pe Random

        aTemp = head1;//reAssign to head
        while(aTemp != null){
            bTemp = map.get(aTemp);
            bTemp.random = map.get(aTemp.random);
            aTemp = aTemp.next;
        }
       return head2; 
    }
    
}