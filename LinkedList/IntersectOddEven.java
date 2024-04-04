package LinkedList;

import java.util.ArrayList;

public class IntersectOddEven {
    public static ListNode AlterList(ListNode head1,  ListNode head2) {

        ListNode head = new ListNode(0);
        ListNode temp1 = head1, temp2 = head2;
        ArrayList<ListNode> odd = new ArrayList<>();
        ArrayList<ListNode> even = new ArrayList<>();
        while(temp1 != null && temp2 != null){
            if(temp1.val % 2 != 0){
                while(temp2 != null && temp2.val <= temp1.val){
                    if(temp1.val == temp2.val ){
                        odd.add(temp1);
                        temp2 = temp2.next;
                        break;
                    }
                    temp2 = temp2.next;
                }
            }
            else{
                while(temp2 != null && temp2.val <= temp1.val){
                    if(temp1.val == temp2.val){
                        even.add(temp1);
                        temp2 = temp2.next;
                        break;
                    }
                    temp2 = temp2.next;
                }
            }
            temp1 = temp1.next;
        }
        int i = 0, j = 0;
        if(odd.size() != 0){
            head.val = odd.get(0).val;
            i = 1;
        }
        else if(even.size() != 0){
            head.val = even.get(0).val;
            j = 1;
        }
        else{
            return null;
        }
        ListNode temp = head;
        while(i < odd.size()){
            temp.next = (odd.get(i++));
            temp = temp.next;
        }
        while(j < even.size()){
            temp.next = (even.get(j++));
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(231);
        head1.addNode(456);
        head1.addNode(6334);

        ListNode head2 = new ListNode(231);
        head2.addNode(234);
        head2.addNode(456);
        head2.addNode(6966);
        AlterList(head1, head2);
    }
}
