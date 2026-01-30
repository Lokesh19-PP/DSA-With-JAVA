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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode pre_prev = dummy;
        ListNode prev = head;
        ListNode temp = head.next;
        
        while(temp != null){
            if(temp != null && prev.val == temp.val){
                while(temp != null && temp.val == prev.val){
                    temp = temp.next;
                }
                pre_prev.next = temp;
                prev = temp;
                if(temp != null) temp = temp.next ;
            }
            else{
                pre_prev = prev;
                prev = temp;
                temp = temp.next;
            }
        }
        return dummy.next;
    }
}