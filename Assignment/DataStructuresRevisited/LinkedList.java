package DataStructuresRevisited;
import java.util.Scanner;

public class LinkedList {
    static Scanner s = new Scanner(System.in);
    <T>LinkedListNode<T> createList(){
        System.out.print("Enter data : ");
        LinkedListNode head = null;
        LinkedListNode tail = null;
        int data = s.nextInt();

        while(data != -1){
            LinkedListNode<Integer> node = new LinkedListNode<>(data);
            if(head == null){
                head = node;
                tail = node;
            }
            else{
                tail.next = node;
                tail = node;
            }
            data = s.nextInt();
        }
        return head;
    }

    void printList(LinkedListNode head){
        LinkedListNode temp = head;
        System.out.println();
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    int lenLinkedList(LinkedListNode head){
        int len = 0;
        LinkedListNode temp = head;
        while(temp != null){
            temp = temp.next;
            len++;
        }
        return len;
    }


    <T>LinkedListNode<T> insertNode(LinkedListNode<T> head,T data,int pos){

        LinkedListNode temp = head;
        int len = lenLinkedList(head);

        if(pos>len){
            System.out.println("Position greater than actual list");
            return head;
        }

        int count = 1;
        LinkedListNode<T> newNode = new LinkedListNode<>(data);
        if(pos == 0){
            newNode.next = head;
            head = newNode;
        }
        else {
            while(count != pos){
                temp = temp.next;
                count++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        return head;
    }

    LinkedListNode deleteNode(LinkedListNode<Integer> head,int data){
        LinkedListNode<Integer> temp = head;
        if(head.data == data){
            head = head.next;
        }
        else{
            while(temp.next != null && temp.next.data != data){
                temp = temp.next;
            }
            if(temp.next != null){
                temp.next = temp.next.next;
            }
        }
        return head;
    }
    <T>LinkedListNode<T> reverseLinkedList(LinkedListNode<T> head){
        if(head == null){
            return head;
        }
        LinkedListNode<T> prev = null;
        LinkedListNode<T> current = head;
        LinkedListNode<T> forw = null;
        while(current != null){
            forw = current.next;
            current.next = prev;
            prev = current;
            current = forw;
        }
        return prev;
    }
    public static void main(String[] args) {
        LinkedList s = new LinkedList();
        LinkedListNode head = s.createList();
        s.printList(head);
        head = s.insertNode(head,10,0);
        s.printList(head);
        head = s.deleteNode(head,4);
        s.printList(head);
        s.printList(s.reverseLinkedList(head));
    }
}
class LinkedListNode<T>{
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data){
        this.data = data;
        this.next = null;
    }
}
