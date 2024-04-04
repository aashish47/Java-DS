package LinkedList;

import java.util.LinkedHashSet;

public class LastApperance {
    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode forw;
        while(curr != null){
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        return prev;
    }

    public static ListNode LastAppearance(ListNode head) {
        head = reverse(head);
        ListNode temp = head;
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        while(temp != null){
            set.add((Integer)temp.val);
            temp = temp.next;
        }

        int flag = 0;
        ListNode last = head;
        for(Integer o : set){
            if(flag == 0){
                head.val = o;
                last = head;
                temp = head;
                temp = temp.next;
                flag = 1;
            }
            else {
                last = temp;
                temp.val = o;
                temp = temp.next;
            }
        }
        last.next = null;
        return reverse(head);
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.addNode(2);
        head.addNode(3);
        head.addNode(2);
        head.addNode(3);
        head.addNode(1);
        LastAppearance(head);
    }
}
