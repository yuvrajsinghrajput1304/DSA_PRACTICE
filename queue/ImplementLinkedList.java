package oops.queue;

public class ImplementLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static class LLqueue{
        Node front;
        Node rear;

        void enqueue(int data){
            Node nn=new Node(data);
            if(isEmpty()){
                front=nn;
                rear=nn;
                return;
            }
            rear.next=nn;
            rear=nn;

        }

        boolean isEmpty(){
            return front==null;
        }

        void display(){
            if(isEmpty()){
                System.out.println("empty");
            }
            Node temp=front;
            while(temp.next!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        LLqueue q=new LLqueue();
        q.enqueue(1);
        // q.enqueue(2);
        // q.enqueue(3);
        // q.enqueue(4);
        // q.enqueue(5);
        q.display();
        System.out.println(q.front.data);
        System.out.println(q.rear.data);
    }
    
}
