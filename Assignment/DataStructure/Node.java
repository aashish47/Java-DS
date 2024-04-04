package CodingNinjas.DataStructure;
import java.util.ArrayList;

/**
 * Created by Hp on 7/13/2017.
 */
class MyStackOverFlowException extends RuntimeException {

}

class MyStackUnderFlowException extends RuntimeException {

}
class MyQueueUnderflow extends RuntimeException{

}
public class Node<T> {
    T data;
    Node<T> next;
    Node(T data){
        this.data = data;
    }
}
class LinkedListNode<T> {
    public T data;
    public LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.setData(data);
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
class ListNode<T> {
    public T data;
    public ListNode<T> next;
    public ListNode(T data)
    {
        this.data=data;
    }
}
class GenericTreeNode<T>{
    T data;
    ArrayList<GenericTreeNode<T>> children;
    public GenericTreeNode(T data){
        this.data = data;
        children = new ArrayList<>();
    }
}

    class BinaryTreeNode<T> {
        T data;
        BinaryTreeNode<T> left;
        BinaryTreeNode<T> right;

        public BinaryTreeNode(T data) {
            this.data = data;
        }
    }
  class  StackNode<T>{
    private  T data;
    StackNode<T> next,top;
    StackNode(){
        top = null;
    }
    public void push(T data){
        StackNode<T> newNode = new StackNode<>();
        newNode.data=data;
        if(top==null){
            top = newNode;
        }
        else{
            newNode.next=top;
            top=newNode;
        }
    }
    public T pop()throws MyStackOverFlowException {
        if(top==null){
            throw new MyStackUnderFlowException();
        }
        else{
            T data = top.data;
            top = top.next;
            return data;
        }
    }
    public void traverse(){
        StackNode temp = top;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public T peek(){
        return top.data;
    }
    public boolean isEmpty(){
        return top==null;
    }
}
class QueueNode<T>{
    private T data;
    QueueNode<T> front,rear,next;
    QueueNode(){
        front = null;
        rear = null;
    }
    QueueNode(T data){
        this.data = data;
        front=null;
        rear=null;
    }
    public void enqueue(T data){
        QueueNode<T> node = new QueueNode<>(data);
        if(front==null){
            front = node;
        }
        else{
            rear.next=node;
        }
        rear = node;

    }
    public T dequeue () throws MyQueueUnderflow{
        if(isEmpty()){
            throw new MyQueueUnderflow();
        }
        T data = front.data;
        front = front.next;
        return data;
    }
    public void traverse(){
        QueueNode temp = front;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public boolean isEmpty(){
        return front==null;
    }
}
class DiameterObject {
    int diameter;
    int height;

    DiameterObject(int diameter, int height) {
        this.diameter = diameter;
        this.height = height;
    }
}