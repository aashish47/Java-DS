package LinkedList;

public class Rearrange {
    public static ListNode  middle(ListNode  A){
        ListNode  slow = A, fast = A;
        while(slow!= null && fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = slow.next;
        slow.next = null;
        return fast;
    }

    public static ListNode  reverse(ListNode  A){
        ListNode  prev = null;
        ListNode  curr = A;
        ListNode  forw;
        while(curr != null){
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        return prev;
    }

    public static ListNode  changelist(ListNode  A) {
        // Write your code here
        ListNode  B = middle(A);
        B = reverse(B);
        ListNode  head = A;
        ListNode  temp = A;
        A = A.next;
        while(A != null || B != null){
            temp.next = B;
            temp = B;
            B = B.next;
            if(B == null){
                break;
            }
            temp.next = A;
            temp = A;
            A = A.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.addNode(2);
        head.addNode(3);
        head.addNode(4);
        head.addNode(5);
        head.addNode(6);
        changelist(head);
    }
}
