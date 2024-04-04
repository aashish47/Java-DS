package LinkedList;

public class MergeTwoListReverse {
    public static ListNode nextNode(ListNode head1, ListNode head2){
        if(head1 == null){
            return head2;
        }
        else if(head2 == null){
            return head1;
        }
        else{
            return head1.val < head2.val ? head1 : head2;
        }

    }
    public static ListNode merge(ListNode head1, ListNode head2) {
        // Write your code here
        ListNode head = nextNode(head1, head2);
        ListNode temp = head;
        head1 = head == head1 ? head1.next : head1;
        head2 = head == head2 ? head2.next : head2;
        while(head1 != null || head2 != null){
            ListNode curr = nextNode(head1, head2);
            head1 = curr == head1 ? head1.next : head1;
            head2 = curr == head2 ? head2.next : head2;
            curr.next = temp;
            temp = curr;
        }
        head.next = null;
        return temp;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.addNode(2);
        head1.addNode(3);
        ListNode head2 = new ListNode(4);
        head2.addNode(5);
        head2.addNode(6);
        merge(head1,head2);
    }
}
