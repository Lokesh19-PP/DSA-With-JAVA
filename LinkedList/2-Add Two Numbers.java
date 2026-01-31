class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode(0);
        ListNode temp = l3;
        int carry=0;
        while(l1 != null || l2 != null){
            int sum=(l1 != null ? l1.val:0)+(l2 != null ? l2.val:0)+carry;
            carry=sum/10;
            temp.next=new ListNode(sum%10);
            temp= temp.next;
            if(carry>0){
                temp.next = new ListNode(carry);
            }
            l1=(l1 != null) ? l1.next:null;
            l2=(l2 != null) ? l2.next:null;
        }
        return l3.next;
    }
}