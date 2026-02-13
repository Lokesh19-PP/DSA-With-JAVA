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
    public ListNode insertionSortList(ListNode head) {
        if(head == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = head;
        ListNode temp = head.next;
        while(temp != null){
            if(prev.val <= temp.val){
                prev = temp;
                temp = temp.next;
                continue;
            } 
            else{
                ListNode p = dummy;
                while(p.next.val <= temp.val){
                    p = p.next;
                }
                ListNode t = temp.next;
                prev.next = t;
                temp.next = p.next;
                p.next = temp;
                temp = prev.next;
            }
        }
        return dummy.next;
    }
}