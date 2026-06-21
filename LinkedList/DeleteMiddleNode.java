package oops.LinkedList;
import oops.LinkedList.Implementation.Linkedlist;
import oops.LinkedList.Implementation.Node;


public class DeleteMiddleNode {
    public static void deleteMiddleNode(Linkedlist ll){
        Node fast=ll.head;
        Node slow=ll.head;
        while(fast.next.next!=null && fast.next.next.next.next!=null){
            slow=slow.next; 
            fast=fast.next.next;
            

        } 
        slow.next=slow.next.next;



    }
    


    public static void main(String[] args) {
        Linkedlist ll=new Linkedlist();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        // ll.add(7);
        ll.display();
        deleteMiddleNode(ll);
        ll.display();


        
    }
}
