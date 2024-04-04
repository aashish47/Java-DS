package LinkedList;

public class OddEven {
    public static ListNode  changelist(ListNode  head) {
        // Write your code here
        ListNode  odd = head;
        ListNode  evenhead = head.next;
        ListNode  even = evenhead;
        while(odd != null && odd.next != null && even != null && even.next != null){
            odd.next = odd.next.next;
            odd = odd.next;
            even.next = even.next.next;
            even = even.next;
        }
        odd.next = evenhead;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.addNode(2);
        head.addNode(3);
        head.addNode(4);
        head.addNode(5);
        changelist(head);
    }
}
