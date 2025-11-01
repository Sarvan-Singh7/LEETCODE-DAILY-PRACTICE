
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        //convert  array to hashset
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        //now to make a loop ki jab jab head pe match ho so head.next ho jae
        while(head !=null && set.contains(head.val)){
            head = head.next;
        }
        ///now jo bhi head ya new head par delete karni thi woh toh ho gyi now new head is also here so we can traverse it to check for now

        ListNode temp = head;
        while(temp != null && temp.next !=null){
            if(set.contains(temp.next.val)){  //agar head se ya pichli value se agli value comare karte karte same ho gyi so delete it
                temp.next = temp.next.next;
            }
            else{                      //agar nahin hai set main so temp ko age shift kardo
               temp = temp.next;
            }

        }
        return head;
    }
}