package CodingNinjas.DataStructure;

import java.util.Scanner;

public class ReverseQueue {
    public static void reverseQueue(QueueNode<Integer> q) {
        if(q.front==null){
            return;
        }
        int data = q.dequeue();
        reverseQueue(q);
        q.enqueue(data);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        QueueNode<Integer> obj = new QueueNode<>();
        while (data!=-1){
            obj.enqueue(data);
            data=s.nextInt();
        }
        obj.traverse();
        reverseQueue(obj);
        System.out.println();
        obj.traverse();
    }
}
