package LinkedList;

public class AddNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode temp1 = l1, temp2 = l2, dummy = new ListNode(0), curr = dummy;
        while(temp1 != null || temp2 != null){
            int x = temp1 != null ? temp1.val : 0;
            int y = temp2 != null ? temp2.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if(temp1 != null){
                temp1 = temp1.next;
            }
            if(temp2 != null){
                temp2 = temp2.next;
            }
        }
        if(carry > 0){
            curr.next = new ListNode(1);
        }
        return dummy.next;
    }
}
