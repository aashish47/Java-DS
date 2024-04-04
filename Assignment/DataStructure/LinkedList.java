package CodingNinjas.DataStructure;
import java.util.Scanner;

public class LinkedList {
    static LinkedListNode<Integer> left;
    <T>LinkedListNode<T> createList(){
        Scanner s = new Scanner(System.in);
        LinkedListNode head = null;
        LinkedListNode tail = null;
        System.out.println("Enter data : ");
        int data = s.nextInt();
        while (data!=-1){
            LinkedListNode<Integer> newNode = new LinkedListNode<>(data);
            if(head==null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail=newNode;
            }
            //System.out.println("Enter data :");
            data=s.nextInt();
        }

        return head;
    }
    Node insertNode(Node head,int position,int data){
        Node temp = head;
        if(position==0){
            Node newNode = new Node(data);
            newNode.next = head;
            head=newNode;
            return head;
        }
        for(int i =1;i!=position;i++){
            temp = temp.next;
        }
        Node newNode = new Node(data);
        newNode.next=temp.next;
        temp.next=newNode;
        return head;
    }
    public static Node reverseList(Node current){
        Node previous = null;
        Node forward ;
        while(current!=null){
            forward = current.next;
            current.next=previous;
            previous=current;
            current=forward;
        }

        return previous;
    }
    Node reverseListRecursively(Node current,Node previous){
        if(current==null){
            return previous;
        }
        Node forward = current.next;
        current.next=previous;
        previous=current;
        current=forward;
        return  reverseListRecursively(current,previous);
    }
    public static LinkedListNode<Integer> mergeTwoList(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
    LinkedListNode<Integer> head3;
        if(head1.data.compareTo(head2.data)<0){
        head3=head1;

        head1=head1.next;
        head3.next=null;
    }
        else{
        head3=head2;

        head2=head2.next;
        head3.next=null;
    }
    LinkedListNode<Integer> start =head3;
        while(head1!=null&&head2!=null){
        if(head1.data.compareTo(head2.data)<0){
            head3.next=head1;

            head1=head1.next;

        }
        else{
            head3.next=head2;

            head2=head2.next;

        }
            head3.next.next=null;
            head3=head3.next;
    }
        if(head1==null){
        head3.next=head2;
    }
        else{
        head3.next=head1;
    }
        return start;

}
    public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> forward = head.next, previous = head;

        while(forward!=null){
            if(forward.getData().compareTo(previous.getData())!=0){
                previous.next=forward;
                previous=forward;
                forward=forward.next;
                previous.next=null;
            }
            else{
                forward=forward.next;
            }
        }
        return head;
    }

    public static LinkedListNode<Integer> swap_nodes(LinkedListNode<Integer> head, int i, int j) {
        LinkedListNode<Integer> prev = null, forward = head, current = head;
        int countSmall = 0, countBig = 0;
        int small, big;
        if (i < j) {
            small = i;
            big = j;
        }
        else {
            small = j;
            big = i;
        }
        while (current != null && countSmall != small) {
            countSmall++;
            prev = current;
            current = current.next;

        }
        while (forward != null && countBig != big) {
            countBig++;
            forward = forward.next;
        }

        if (countSmall == 0) {
            prev = head;
            while (prev.next != forward) {
                prev = prev.next;
            }
            if (countBig != 1) {
                head = head.next;
                current.next = forward.next;
                forward.next = head;
                prev.next = current;
                head = forward;
                return head;
            }
            else {
                current.next = forward.next;
                forward.next = current;
                head = forward;
                return head;
            }
        }
        else {
            prev.next = forward;
            prev = current.next;
            current.next = forward.next;
            forward.next = prev;
            while (prev.next != forward) {
                prev = prev.next;
            }
            prev.next = current;

            return head;
        }
    }
    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head){
        LinkedListNode<Integer>slow=head,fast=head;
        while(fast!=null&&fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return  slow;
    }
    public static boolean isPalindrome_2(LinkedListNode<Integer> head,LinkedListNode<Integer> tail) {
//        LinkedListNode<Integer> mid = midPoint(head);
//        LinkedListNode<Integer> head2 = mid.next;
//        mid.next=null;
//        LinkedListNode<Integer>headNew=reverseList(head2);
//        while(head!=null&&headNew!=null){
//            if(head.data.compareTo(headNew.data)!=0){
//                return false;
//            }
//            else{
//                head=head.next;
//                headNew=headNew.next;
//            }
//        }
//        return true;
        left = head;
        if(tail==null){
            return true;
        }
        boolean ans = isPalindrome_2(head,tail.next);
        if(ans==false){
            return false;
        }
        if(left==null){
            return ans;
        }
        if(tail.data.compareTo(left.data)==0){
            left = left.next;
            return true;
        }
        else{
            return false;
        }


    }
    public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head )
    {
        LinkedListNode<Integer> temp = head;
        int n = length(head);
        for(int i =0;i<n-1;i++){
            temp=head;
            for(int j = 0;j<n-1-i;j++){
                if(temp.data.compareTo(temp.next.data)>0){
                    head=swap_nodes(head,j,j+1);
                }
                else {
                    temp = temp.next;
                }
            }
        }
        return head;
    }
    public static int length(LinkedListNode<Integer> head){
        int count=0;
        while(head!=null){
            head=head.next;
            count++;
        }
        return count;
    }
    static int count = 0;
    public static LinkedListNode<Integer> nthNodeFromLastIter(LinkedListNode<Integer> head, int n){
        if(head==null){
            return null;
        }
        LinkedListNode<Integer> smallAns=nthNodeFromLastIter(head.next,n);
        if(smallAns!=null){
            return smallAns;
        }
        if(count==n){
            head.next=null;
            return head;
        }
        count++;
        return smallAns;

    }
    public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
        if(head==null||head.next==null){
            return head;
        }
        LinkedListNode<Integer> mid = midPoint(head);
        LinkedListNode<Integer> headLeft = head;
        LinkedListNode<Integer> headRight = mid.next;
        mid.next=null;
        headLeft=mergeSort(headLeft);
        headRight=mergeSort(headRight);
        return mergeTwoList(headLeft,headRight);

    }
    public static LinkedListNode<Integer> sortEvenOdd(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> oddHead=head,evenHead=head,tempOdd=head,tempEven=head;
        int flagOdd=0,flagEven=0;
        while(head!=null){
            if(head.data%2!=0) {
                if(flagOdd==0){
                    oddHead=head;
                    tempOdd=oddHead;
                    flagOdd=1;
                }
                else {
                    tempOdd.next = head;
                    tempOdd = head;
                }
            }
            else{
                if(flagEven==0){
                    evenHead=head;
                    flagEven=1;
                    tempEven=evenHead;
                }
                else {
                    tempEven.next = head;
                    tempEven = head;
                }
            }
            head=head.next;
        }
        tempOdd.next=evenHead;
        tempEven.next=null;
        return oddHead;

    }
    public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
        int countM=1,countN=0;
        LinkedListNode<Integer> tempPrev = head,tempForw = head;
        if(M==0){
            return null;
        }
        while(tempPrev!=null&&tempPrev.next!=null){
            while(tempPrev!=null&&tempPrev.next!=null&&countM<M){
                tempPrev=tempPrev.next;
                tempForw=tempForw.next;
                countM++;
            }

            while(tempForw!=null&&tempForw.next!=null&&countN<N){
                tempForw=tempForw.next;
                countN++;
            }
            tempPrev.next=tempForw.next;
            tempPrev=tempPrev.next;
            tempForw=tempPrev;
            countM=1;
            countN=0;
        }
        return head;
    }
//    public static ListNode<Integer> changelist(ListNode<Integer> head) {
//        return list(head,head);
//    }
//    public static ListNode<Integer> list(ListNode<Integer> head,ListNode<Integer> tail){
//        left=head;
//        if(tail==null){
//            return null;
//        }
//        ListNode<Integer> smallAns = list(head,tail.next);
//        if(smallAns==head){
//            return head;
//        }
//        if(tail==left||left.next==tail){
//            tail.next=null;
//            return head;
//        }
//
//        tail.next=left.next;
//        left.next=tail;
//        left=tail.next;
//        return left;
//
//    }
    public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
        int count  ;
        LinkedListNode<Integer>previous = null,forward,current=head;
        int flag=0;
        LinkedListNode<Integer>newHead = head,preTail=head,newTail;
        while(current!=null){
            count=0;
            newTail=current;
            while(current!=null&&count!=k){
                forward=current.next;
                current.next=previous;
                previous=current;
                current=forward;
                count++;
            }
            if(flag==0) {
                newHead = previous;
                flag = 1;
            }
            else{
                preTail.next=previous;
                preTail=newTail;
                preTail.next=null;
            }

        }
        return newHead;
    }


    public  static  void printList(LinkedListNode head){
        if(head == null ){
            return;
        }
        System.out.print(head.data+"->");
        printList(head.next);
    }
    public static void main(String[] args) {
        LinkedList s = new LinkedList();
        //Node<Integer> head1 = s.createList();
        //Node<Integer> head2 = s.createList();
        //head = s.insertNode(head,2,2);
        //s.printList(head);
        //head = s.reverseList(head);
        //s.printList(head);
        //head=s.reverseListRecursively(head,null);
        //s.printList(head);
        //s.printList(mergeTwoList(head1,head2));
        LinkedListNode<Integer> head = s.createList();
        //s.printList(removeDuplicates(head));
        //s.printList(swap_nodes(head,1,2));
        //nthNodeFromLastIter(head,2);
        //s.printList(nthNodeFromLastIter(head,2));
        //s.printList(mergeSort(head));
        //s.printList(sortEvenOdd(head));
        //s.printList(skipMdeleteN(head,0,3));
        //s.printList(changelist(head));
        //LinkedListNode<Integer> head = s.createList();
        //s.printList(kReverse(head,11));
        //
        //System.out.println(isPalindrome_2(head,head));
    }
}
